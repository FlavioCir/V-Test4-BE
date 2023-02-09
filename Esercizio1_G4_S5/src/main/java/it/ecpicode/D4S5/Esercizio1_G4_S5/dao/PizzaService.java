package it.ecpicode.D4S5.Esercizio1_G4_S5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ecpicode.D4S5.Esercizio1_G4_S5.entity.Pizza;

@Service
public class PizzaService {

	@Autowired
	private PizzaRepository pizzaRepo;
	
	public void insertPizza(Pizza p) {
		pizzaRepo.save(p);
		System.out.println("Pizza inserita correttamente!");
	}
	
}
