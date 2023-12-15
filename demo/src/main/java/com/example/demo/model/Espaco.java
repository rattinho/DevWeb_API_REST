package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Espaco")
public class Espaco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String localizacao;
    private int capacidade;

    @OneToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    // Getters e Setters
}
