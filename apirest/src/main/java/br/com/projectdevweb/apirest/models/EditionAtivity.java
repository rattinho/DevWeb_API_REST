package br.com.projectdevweb.apirest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name = "edicao_atividade")
public class EditionAtivity {

    @EmbeddedId
    private Class id;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "edicao_id")
    private Edition edicao;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "atividade_id")
    private Ativity atividade;

    // getters e setters
}