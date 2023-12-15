package com.example.demo.model;

import javax.persistence.*;

import org.hibernate.annotations.ManyToAny;

import java.util.Date;
import java.sql.Time;

@Entity
@Table(name = "Atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String tipo;
    private String descricao;
    private Date dataInicial;
    private Time horarioInicial;
    private Time horarioFinal;

    @ManyToAny
    @JoinColumn(name = "aluno_id")
    private Usuario aluno;

    @ManyToOne
    @JoinColumn(name = "edicao_id")
    private Edicao edicao;

    // Getters e Setters
}
