package com.residencia.academia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.academia.entities.Turma;
import com.residencia.academia.repositories.TurmaRepository;

@Service
public class TurmaService {

	@Autowired
	TurmaRepository turmaRepo;
	public List<Turma> listarTurma() {
		return turmaRepo.findAll();
	}
	
	public Turma buscarTurmaPorId(Integer id) {
		return turmaRepo.findById(id).orElse(null);
	}
	public Turma salvarTurma(Turma turma) {
		return turmaRepo.save(turma);
	}

	public Turma atualizarTurma(Turma turma) {
		return turmaRepo.save(turma);
	}
	
	public Boolean deletarTurma(Turma turma) {
		if(turma == null)
			return false;
					
		Turma turmaExistente = buscarTurmaPorId(turma.getCodigoTurma());
		
		if(turmaExistente == null)
			return false;
		
		turmaRepo.delete(turma);
		
		Turma turmaContinuaExistindo = buscarTurmaPorId(turma.getCodigoTurma());
		
		if(turmaContinuaExistindo == null)
			return true;
		
		return false;

	}
}
