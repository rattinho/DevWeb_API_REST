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

import org.hibernate.annotations.*;

@Entity
@Table(name = "atividade")
public class Ativity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String tipo;
    private String descricao;
    private Date data_inicial;
    private Time horario_inicial;
    private Time horario_final;

    @OneToMany(mappedBy = "atividade")
    private Set<Class> usuarios;

    @OneToMany(mappedBy = "atividade")
    private Set<EditionAtivity> edicao;

    @ManyToAny
    private User aluno_id;

    @OneToOne
    private Edition espaco_id;
}
