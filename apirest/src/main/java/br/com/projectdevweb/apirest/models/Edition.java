package br.com.projectdevweb.apirest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.sql.Date;
import java.sql.Time;
import java.util.Set;

@Entity
@Table(name = "edicao")
public class Edition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int ano;
    private Date data_inicial;
    private Date data_final;
    private String cidade;

    @OneToMany(mappedBy = "edicao")
    private Set<EditionAtivity> atividade;

    @OneToOne
    private User organizador;

    @OneToOne
    private Event evento_id;
}
