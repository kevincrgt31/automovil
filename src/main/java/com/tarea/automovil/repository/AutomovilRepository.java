package com.tarea.automovil.repository;

import com.tarea.automovil.model.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutomovilRepository extends JpaRepository<Automovil, Long> {

}