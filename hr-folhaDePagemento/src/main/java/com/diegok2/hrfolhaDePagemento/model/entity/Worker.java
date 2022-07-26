package com.diegok2.hrfolhaDePagemento.model.entity;

import javax.persistence.*;
import java.io.Serializable;


public class Worker implements Serializable {

    private Long id;

    private String nome;

    private Double valorDiario;

    public Worker(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(Double valorDiario) {
        this.valorDiario = valorDiario;
    }



}
