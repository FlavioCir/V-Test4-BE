package it.ecpicode.D4S5.Esercizio1_G4_S5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.ecpicode.D4S5.Esercizio1_G4_S5.config.BevandaConfig;
import it.ecpicode.D4S5.Esercizio1_G4_S5.config.FranchisingConfig;
import it.ecpicode.D4S5.Esercizio1_G4_S5.config.PizzaConfig;
import it.ecpicode.D4S5.Esercizio1_G4_S5.dao.BevandaService;
import it.ecpicode.D4S5.Esercizio1_G4_S5.dao.FranchisingService;
import it.ecpicode.D4S5.Esercizio1_G4_S5.dao.PizzaService;
import it.ecpicode.D4S5.Esercizio1_G4_S5.entity.Bevanda;
import it.ecpicode.D4S5.Esercizio1_G4_S5.entity.Franchising;
import it.ecpicode.D4S5.Esercizio1_G4_S5.entity.Pizza;
import it.ecpicode.D4S5.Esercizio1_G4_S5.entity.Prodotto;

@SpringBootApplication
public class Esercizio1G4S5Application implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(Esercizio1G4S5Application.class, args);
	}
	
	//pizza
	@Autowired
	PizzaService ps;
	
	ApplicationContext ctx1 = new AnnotationConfigApplicationContext(PizzaConfig.class);
	
	// bevanda
	@Autowired
	BevandaService bs;
	
	ApplicationContext ctx2 = new AnnotationConfigApplicationContext(BevandaConfig.class);
	
	// franchising
	@Autowired
	FranchisingService fs;
	
	ApplicationContext ctx3 = new AnnotationConfigApplicationContext(FranchisingConfig.class);
	
	@Override
	public void run(String... args) throws Exception {
		
		boolean insertPizza = true;
		if(insertPizza) {
			insertPizza();
		}
		
		boolean insertBevanda = true;
		if(insertBevanda) {
			insertBevanda();
		}
		
		boolean insertFranchising = true;
		if(insertFranchising) {
			insertFranchising();
		}
		
		((AnnotationConfigApplicationContext)ctx1).close();
		((AnnotationConfigApplicationContext)ctx2).close();
		((AnnotationConfigApplicationContext)ctx3).close();
	}
	
	public void insertPizza() {
		Pizza p = (Pizza)ctx1.getBean("p1");
		ps.insertPizza(p);
	}
	
	public void insertBevanda() {
		Bevanda b = (Bevanda)ctx2.getBean("b1");
		bs.insertBevanda(b);
	}
	
	public void insertFranchising() {
		Franchising f = (Franchising)ctx3.getBean("f1");
		fs.insertFranchising(f);
	}

}
