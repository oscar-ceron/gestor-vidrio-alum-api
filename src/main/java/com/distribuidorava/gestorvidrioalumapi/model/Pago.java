package com.distribuidorava.gestorvidrioalumapi.model;

import jakarta.persistence.*;

@Entity
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
