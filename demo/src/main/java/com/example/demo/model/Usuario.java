package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;
    private String email;
    private String nome;
    private String afiliacao;

    // Getters e Setters
}
