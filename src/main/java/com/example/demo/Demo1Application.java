package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.PersonneRepository;
import com.example.demo.entities.Personne;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {
	@Autowired
	private PersonneRepository personneRepository;

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
      personneRepository.save(new Personne("bouzarouata", "El houssine","0648709235"));
	}

}
