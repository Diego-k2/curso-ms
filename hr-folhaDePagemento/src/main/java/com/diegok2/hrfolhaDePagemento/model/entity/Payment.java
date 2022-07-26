package com.diegok2.hrfolhaDePagemento.model.entity;

public class Payment {

    private String nome;

    private Double valorDiario;

    private int diasTrabalhados;


    public Payment(){}

    public Payment(String nome, Double valorDiario, int diasTrabalhados) {
        this.nome = nome;
        this.valorDiario = valorDiario;
        this.diasTrabalhados = diasTrabalhados;
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

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }


    public double getTotal(){
        return diasTrabalhados * valorDiario;
    }

}
