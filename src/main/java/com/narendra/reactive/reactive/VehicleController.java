package com.narendra.reactive.reactive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class VehicleController {
    @Autowired
    public VehicleRepository vehicleRepository;

    @GetMapping("/model/{model}")
    public Flux<Vehicle> findByModel(@PathVariable String model) {
        return vehicleRepository.findByModel(model);
    }


    @GetMapping("/vehicle/{id}")
    Mono<Vehicle> findById(@PathVariable Integer id) {
         return vehicleRepository.findById(id);
    }

    @GetMapping("/all")
    public Flux<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }
}
