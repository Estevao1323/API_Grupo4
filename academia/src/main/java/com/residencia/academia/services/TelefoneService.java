package com.residencia.academia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.academia.entities.Telefone;
import com.residencia.academia.repositories.TelefoneRepository;

@Service
public class TelefoneService {

	@Autowired
	TelefoneRepository telefoneRepo;

	public List<Telefone> listarTelefone() {
		return telefoneRepo.findAll();
	}

	public Telefone buscarTelefonePorId(Integer id) {
		return telefoneRepo.findById(id).orElse(null);
	}

	public Telefone salvarTelefone(Telefone telefone) {
		return telefoneRepo.save(telefone);
	}

	public Telefone atualizarTelefone(Telefone telefone) {
		return telefoneRepo.save(telefone);
	}

	public Boolean deletarTelefone(Telefone telefone) {
		if (telefone == null)
			return false;

		Telefone telefoneExistente = buscarTelefonePorId(telefone.getCodigoTelefone());

		if (telefoneExistente == null)
			return false;

		telefoneRepo.delete(telefone);

		Telefone telefoneContinuaExistindo = buscarTelefonePorId(telefone.getCodigoTelefone());

		if (telefoneContinuaExistindo == null)
			return true;

		return false;

	}
}
