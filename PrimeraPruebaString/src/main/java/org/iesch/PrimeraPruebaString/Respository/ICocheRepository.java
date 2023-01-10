package org.iesch.PrimeraPruebaString.Respository;

import org.iesch.PrimeraPruebaString.Modelo.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICocheRepository extends JpaRepository<Coche, Long> {
    public List<Coche> findByMarca(String marca);
    public List<Coche> findByMarcaAndModelo(String marca, String modelo);
    public List<Coche> findByPotenciaGreaterThan(int potencia);
    @Query(value = "select * from coche where marca = :marca and modelo like %:modelo and potencia between 300 and 600", nativeQuery = true)
    public List<Coche> encuentraCochesConMarcaAndModeloAcabaYPotencia(String marca, String modelo);

}
