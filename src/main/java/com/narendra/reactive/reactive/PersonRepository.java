package com.narendra.reactive.reactive;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveCrudRepository<Person, Integer> {

    @Query("SELECT count(*) from vehicle")
    Mono<Long> count();




 }