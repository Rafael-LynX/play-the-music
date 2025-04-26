package com.rafael.play.model;
/*
    Descrição: Super Classe que representa um áudio, que pode ser uma música ou um podcast.
 */

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private int classificacao;

    // getters e setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }  
    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }
    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }
    public int getClassificacao() {
        return classificacao;
    }
    public void curtir() {
        this.totalDeCurtidas++;
    }
    
    public void reproduzir() {
        this.totalDeReproducoes++;
    }
    
}
