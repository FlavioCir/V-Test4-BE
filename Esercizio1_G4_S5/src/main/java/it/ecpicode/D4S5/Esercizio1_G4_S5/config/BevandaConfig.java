package it.ecpicode.D4S5.Esercizio1_G4_S5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.ecpicode.D4S5.Esercizio1_G4_S5.entity.Bevanda;

@Configuration
@PropertySource("classpath:application.properties")
public class BevandaConfig {

	@Bean
	public Bevanda b1() {
		Bevanda b = new Bevanda();
		b.setNome("Coca cola");
		b.setCalorie(400);
		b.setPrezzo(2.50);
		
		return b;
	}
	
}
