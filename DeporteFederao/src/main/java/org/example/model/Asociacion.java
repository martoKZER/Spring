package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Asociacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToMany(mappedBy = "asociacion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Club> listaClubes = new ArrayList<>();

    public void addClub(Club c) {
        listaClubes.add(c);
    }
}
