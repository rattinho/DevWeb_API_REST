package br.com.projectdevweb.apirest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name = "turmas")
public class Class {

    @EmbeddedId
    private Class id;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "usuario_id")
    private User usuario;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "atividade_id")
    private Ativity atividade;

    // getters e setters
}
