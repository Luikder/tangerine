package com.tangerine.restapi.repository;

import com.tangerine.restapi.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface que implementa los metodos de JpaRespository con los
 * metodos ya configurados para consultar la BBDD
 */
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
