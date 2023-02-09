package it.ecpicode.D4S5.Esercizio1_G4_S5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.ecpicode.D4S5.Esercizio1_G4_S5.config.PizzaConfig;
import it.ecpicode.D4S5.Esercizio1_G4_S5.dao.PizzaService;
import it.ecpicode.D4S5.Esercizio1_G4_S5.entity.Pizza;
import it.ecpicode.D4S5.Esercizio1_G4_S5.entity.Prodotto;

@SpringBootApplication
public class Esercizio1G4S5Application implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(Esercizio1G4S5Application.class, args);
	}
	
	@Autowired
	PizzaService ps;
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(PizzaConfig.class);
	
	@Override
	public void run(String... args) throws Exception {
		
		boolean insertPizza = true;
		if(insertPizza) {
			insertPizza();
		}
		
		((AnnotationConfigApplicationContext)ctx).close();
	}
	
	public void insertPizza() {
		Pizza p = (Pizza)ctx.getBean("p1");
		ps.insertPizza(p);
	}

}
