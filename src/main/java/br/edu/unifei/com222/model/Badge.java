package br.edu.unifei.com222.model;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Badge extends ObjetoBase{
    private int tipo;
    private Date data;
}
