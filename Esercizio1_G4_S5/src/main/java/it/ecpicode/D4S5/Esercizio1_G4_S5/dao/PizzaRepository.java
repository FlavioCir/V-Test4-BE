package it.ecpicode.D4S5.Esercizio1_G4_S5.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.ecpicode.D4S5.Esercizio1_G4_S5.entity.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}
