package org.iesch.ad.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String marca;
    private String modelo;
    private String color;
}
