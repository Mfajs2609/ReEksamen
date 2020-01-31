package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String modelName;

    @NotNull
    private String fuelType;

    @NotNull
    private int serialNumber;

    @NotNull
    private String color;

}
