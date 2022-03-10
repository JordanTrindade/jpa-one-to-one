package com.jpa.onetone.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.onetone.app.dominios.Endereco;
import com.jpa.onetone.app.dominios.Pessoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

		Pessoa p =  new Pessoa(null, "12345678", "jorda", "3141534");
		Endereco end = new Endereco(null, "serra das pedras", "vespasiano", 495, "serra dourada", "vespasiano");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testejpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();


		em.persist(p);
		em.persist(end);

		em.getTransaction().commit();

		emf.close();
		em.close();

		System.out.println("pronto");
	}

}
