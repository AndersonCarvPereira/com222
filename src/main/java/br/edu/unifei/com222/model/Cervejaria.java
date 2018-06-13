package br.edu.unifei.com222.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Cervejaria extends ObjetoBase{
    private String nome;
    private int tipo;
    private String local;
    @OneToMany
    private List<Cerveja> cervejas;
}
