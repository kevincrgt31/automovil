package com.tarea.automovil.controller;

import com.tarea.automovil.model.Automovil;
import com.tarea.automovil.repository.AutomovilRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomovilController {

    private final AutomovilRepository automovilRepository;

    public AutomovilController(AutomovilRepository automovilRepository) {
        this.automovilRepository = automovilRepository;
    }

    @GetMapping("/devolverAutos")
    public List<Automovil> devolverAutos() {
        return automovilRepository.findAll();
    }
    
    @GetMapping("/insertar")
public String insertarAutos() {

    automovilRepository.save(new Automovil(null, "Toyota", "Corolla", 2020));
    automovilRepository.save(new Automovil(null, "Honda", "Civic", 2021));
    automovilRepository.save(new Automovil(null, "Mazda", "3", 2022));

    return "Datos insertados";
}
}