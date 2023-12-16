package br.com.projectdevweb.apirest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import java.sql.Time;



@Entity
@Table(name = "atividade")
public class Ativity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String tipo;
    private String descricao;
    private Date dataInicial;
    private Time horarioInicial;
    private Time horarioFinal;
    private int espacoId;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }
    public Time getHorarioInicial() {
        return horarioInicial;
    }
    public void setHorarioInicial(Time horarioInicial) {
        this.horarioInicial = horarioInicial;
    }
    public Time getHorarioFinal() {
        return horarioFinal;
    }
    public void setHorarioFinal(Time horarioFinal) {
        this.horarioFinal = horarioFinal;
    }
    public int getEspacoId() {
        return espacoId;
    }
    public void setEspacoId(int espacoId) {
        this.espacoId = espacoId;
    }
}
