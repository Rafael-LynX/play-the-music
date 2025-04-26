package com.rafael.play.model;
/*
 * Descrição: Classe que representa um podcast, que é um tipo de áudio.
 */
import com.rafael.play.service.ReprodutorService;
public class Podcast extends Audio implements ReprodutorService {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void reproduzirVariasVezes(int vezes) {
        for (int i = 0; i < vezes; i++) {
            this.reproduzir();
        }
    }
    public void curtirVariasVezes(int vezes) {
        for (int i = 0; i < vezes; i++) {
            this.curtir();
        }
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalDeCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }

    @Override
    public void favoritas(Audio audio) {
        if(audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " é uma favorita!");
        } else {
            System.out.println(audio.getTitulo() + " não é uma favorita.");
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Host: " + this.getHost());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Duração: " + this.getDuracao() + " minutos");
        System.out.println("Total de Reproduções: " + this.getTotalDeReproducoes());
        System.out.println("Total de Curtidas: " + this.getTotalDeCurtidas());
        System.out.println("Classificação: " + this.getClassificacao() + "/10");
    }
}
