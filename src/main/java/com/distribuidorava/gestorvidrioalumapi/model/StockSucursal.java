package com.distribuidorava.gestorvidrioalumapi.model;

import jakarta.persistence.*;

@Entity
@Table(name="stock_sucursal")
public class StockSucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
