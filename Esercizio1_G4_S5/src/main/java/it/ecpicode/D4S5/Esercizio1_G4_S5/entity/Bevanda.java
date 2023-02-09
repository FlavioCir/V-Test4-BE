package it.ecpicode.D4S5.Esercizio1_G4_S5.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bevande")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bevanda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	String nome;
	double prezzo;
	int calorie;
	
}
