package com.rafael.play.app;
/*
    Projeto: Play
    Autor: Rafael Vieira
    Data: 26/04/2025
    Descrição: Classe que representa um áudio, que pode ser uma música ou um podcast.
 */

import com.rafael.play.model.Musicas;

import javax.swing.JPopupMenu.Separator;

import com.rafael.play.model.Audio;
import com.rafael.play.model.Podcast;


public class Main {
    public static void main(String[] args) {
        Musicas musica = new Musicas();
        musica.setTitulo("Shape of You");
        musica.setArtista("Ed Sheeran");
        musica.setAnoLancamento(2017);
        musica.setGeneroMusical("Pop");
        musica.setAlbum("Divide");
        musica.setDuracao(3.53);
        musica.reproduzirVariasVezes(1000);
        musica.curtirVariasVezes(500);
        musica.exibirInformacoes();
        System.out.println("------------------");
        musica.favoritas(musica);
        System.out.println("------------------");
        

        Podcast podcast = new Podcast();
        podcast.setTitulo("The Daily");
        podcast.setHost("Michael Barbaro");
        podcast.setDescricao("Um resumo das principais notícias do dia.");
        podcast.setDuracao(20.0);
        podcast.reproduzirVariasVezes(500);
        podcast.curtirVariasVezes(200);
        podcast.exibirInformacoes();
        System.out.println("------------------");
        podcast.favoritas(podcast);
        System.out.println("------------------");

        

    }
        
}