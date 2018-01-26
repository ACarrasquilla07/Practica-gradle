package co.ceiba.principal;

import javax.persistence.EntityManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main {
	private static EntityManager manager;
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		manager.getTransaction();
	}

}
