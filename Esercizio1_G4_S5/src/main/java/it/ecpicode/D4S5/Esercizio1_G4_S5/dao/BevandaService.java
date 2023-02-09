package it.ecpicode.D4S5.Esercizio1_G4_S5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ecpicode.D4S5.Esercizio1_G4_S5.entity.Bevanda;

@Service
public class BevandaService {

	@Autowired
	private BevandaRepository bevandaRepo;
	
	public void insertBevanda(Bevanda b) {
		bevandaRepo.save(b);
		System.out.println("Bevanda inserita correttamente!");
	}
	
}
