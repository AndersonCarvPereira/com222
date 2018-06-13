package br.edu.unifei.com222.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Usuario extends ObjetoBase{
    private String nome;
    private Date nascimento;
    @OneToMany
    private List<Checkin> checkins;
    @OneToMany
    private List<Usuario> amigos;
    @OneToMany
    private List<Badge> badges;
}
