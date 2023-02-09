package it.ecpicode.D4S5.Esercizio1_G4_S5.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "franchising")
@Getter
@Setter
@NoArgsConstructor
@Builder
@Scope("prototype")
public class Franchising extends Prodotto{
	
	

}
