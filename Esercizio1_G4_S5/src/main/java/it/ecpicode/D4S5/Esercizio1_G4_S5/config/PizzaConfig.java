package it.ecpicode.D4S5.Esercizio1_G4_S5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.ecpicode.D4S5.Esercizio1_G4_S5.entity.Pizza;

@Configuration
@PropertySource("classpath:application.properties")
public class PizzaConfig {

	@Bean
	public Pizza p1() {
		Pizza p = new Pizza();
		p.setNome("Margherita");
		p.setIngredienti("pomodoro, mozzarella");
		p.setCalorie(1100);
		p.setPrezzo(5.80);
		
		return p;
	}
	
}
