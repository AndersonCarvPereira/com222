package br.edu.unifei.com222.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Checkin extends ObjetoBase{
    private Date data;
    private int estrelas;
    @OneToOne
    private Usuario consumidor;
    @OneToOne
    private Cerveja cerveja;
}
