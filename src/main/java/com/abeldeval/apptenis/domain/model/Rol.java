package com.abeldeval.apptenis.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
