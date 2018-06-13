package br.edu.unifei.com222.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cerveja extends ObjetoBase{
    private String nome;
    private String tipo;
    private double teorAlcolico;
    @OneToMany
    private List<Checkin> checkins;
    @OneToOne
    private Cervejaria cervejaria;
}
