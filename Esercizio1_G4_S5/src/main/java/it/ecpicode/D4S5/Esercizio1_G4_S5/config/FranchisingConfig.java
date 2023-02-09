package it.ecpicode.D4S5.Esercizio1_G4_S5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.ecpicode.D4S5.Esercizio1_G4_S5.entity.Franchising;

@Configuration
@PropertySource("classpath:application.properties")
public class FranchisingConfig {

	@Bean
	public Franchising f1() {
		Franchising f = new Franchising();
		f.setNome("Portachiavi");
		f.setPrezzo(3.00);
		
		return f;
	}
	
}
