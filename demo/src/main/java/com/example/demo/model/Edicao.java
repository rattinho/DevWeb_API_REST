package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Edicao")
public class Edicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int ano;
    private Date dataInicial;
    private Date dataFinal;
    private String cidade;

    @OneToOne
    @JoinColumn(name = "organizador")
    private Usuario organizador;

    @OneToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    // Getters e Setters
}
