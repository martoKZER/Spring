package org.iesch.PrimeraPruebaString;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimeraPruebaStringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeraPruebaStringApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(){
		return args ->{
			System.out.println("Hola");
		};
	}

}
