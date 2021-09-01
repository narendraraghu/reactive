package com.narendra.reactive.reactive;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Data
public class Person {

    @Id
    Integer id;

    String name;
    Address address;

    public static class Address {

        String street;
        String zipCode;
        String city;
    }

}
