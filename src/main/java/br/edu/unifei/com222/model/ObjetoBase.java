package br.edu.unifei.com222.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class ObjetoBase implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private Date criacao;
    private Date modificacao;
}
