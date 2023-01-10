package org.iesch.PrimeraPruebaString;

import com.github.javafaker.Faker;
import org.iesch.PrimeraPruebaString.Modelo.Coche;
import org.iesch.PrimeraPruebaString.Respository.ICocheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@SpringBootApplication
public class PrimeraPruebaStringApplication {
    /*@Autowired
    ICocheRepository iCocheRepository;*/ // para varias clases
    public static void main(String[] args) {
        SpringApplication.run(PrimeraPruebaStringApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ICocheRepository iCocheRepository) { // Solo para el bean.
        // Metodo main para Spring.
        return args -> {

            /*Coche coche = Coche.builder().marca("Audi").modelo("A1").build();
            Coche coche2 = Coche.builder().marca("Audi").modelo("A2").build();
            Coche coche3 = Coche.builder().marca("Audi").modelo("A7").build();*/
            ArrayList<Coche> arrayCoches = new ArrayList<>();
            /*arrayCoches.add(coche);
            arrayCoches.add(coche2);
            arrayCoches.add(coche3);
            iCocheRepository.saveAll(arrayCoches);
            System.out.println(iCocheRepository.findByMarcaAndModelo("Audi","R8"));*/

            //Coche coche = Coche.builder().marca("Ferrari").modelo("433").potencia(600).build();
            //iCocheRepository.save(coche);
            /*Faker faker = new Faker(new Locale("es"));

            for (int i = 0; i < 1000000; i++) {
                Coche coche = Coche.builder().marca(faker.name().firstName()).modelo(faker.name().lastName()).potencia(faker.number().numberBetween(60,800)).build();
                arrayCoches.add(coche);
            }
            iCocheRepository.saveAll(arrayCoches);*/
            /*System.out.println(iCocheRepository.findAll().size());
            Optional<Coche> coche = iCocheRepository.findById(7L);
            if (coche.isPresent()){
                System.out.println(coche.get());
            }*/
            /*List<Coche> todosLosCoches = iCocheRepository.findByMarca("Federico");
             todosLosCoches.forEach(System.out::println);
            List<Coche> todosLosCochesMarcaModelo = iCocheRepository.findByMarcaAndModelo("Fernando", "Alonso");
            todosLosCochesMarcaModelo.forEach(System.out::println);*/
            List<Coche> todosLosCochesMarcaModelo2 = iCocheRepository.encuentraCochesConMarcaAndModeloAcabaYPotencia("Fernando", "Alonso");
            todosLosCochesMarcaModelo2.forEach(System.out::println);
            iCocheRepository.findById(7L).ifPresent(coche -> System.out.println(coche));
        };
    }
}

