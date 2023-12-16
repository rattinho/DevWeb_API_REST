package br.com.projectdevweb.apirest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String login;
    private String email;
    private String nome;
    private String senha;
    private String afiliacao;
    private String perfil;

    @OneToMany(mappedBy = "usuario")
    private Set<Class> atividades;

}
