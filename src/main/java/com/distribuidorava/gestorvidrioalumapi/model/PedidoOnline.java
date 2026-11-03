package com.distribuidorava.gestorvidrioalumapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pedido_online")
public class PedidoOnline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
