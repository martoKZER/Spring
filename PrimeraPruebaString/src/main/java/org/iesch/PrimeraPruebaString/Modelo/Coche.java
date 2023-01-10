package org.iesch.PrimeraPruebaString.Modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String marca;
    String modelo;
    int potencia;
}
