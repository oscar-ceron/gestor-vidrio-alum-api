package com.distribuidorava.gestorvidrioalumapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "inventario_item")
public class InventarioItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
