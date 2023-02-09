package it.ecpicode.D4S5.Esercizio1_G4_S5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ecpicode.D4S5.Esercizio1_G4_S5.entity.Franchising;

@Service
public class FranchisingService {

	@Autowired
	private FranchisingRepository franchisingRepo;
	
	public void insertFranchising(Franchising f) {
		franchisingRepo.save(f);
		System.out.println("Franchising inserito correttamente!");
	}
	
}
