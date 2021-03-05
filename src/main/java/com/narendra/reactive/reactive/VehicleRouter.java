package com.narendra.reactive.reactive;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class VehicleRouter {

    @Autowired
    public VehicleRepository vehicleRepository;

    @Bean
    public RouterFunction<ServerResponse> getAllCategoriesRoute() {
        return route(GET("/all"),
                req ->
                        ok().body(
                                vehicleRepository.findAll(), Vehicle.class)
        );
    }

}