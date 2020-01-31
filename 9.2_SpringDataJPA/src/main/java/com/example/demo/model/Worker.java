package com.example.demo.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "workers")
public class Worker {

     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

     @NotNull
    private String name;

}
