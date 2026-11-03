package com.distribuidorava.gestorvidrioalumapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "registro_corte")
public class RegistroCorte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
