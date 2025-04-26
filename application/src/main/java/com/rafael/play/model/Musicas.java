package com.rafael.play.model;
/*
 * Descrição: Classe que representa um Musica, que é um tipo de áudio.
 */
import com.rafael.play.service.ReprodutorService;

public class Musicas extends Audio implements ReprodutorService {
    private String artista;
    private int anoLancamento;
    private String generoMusical;
    private String album;

    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getGeneroMusical() {
        return generoMusical;
    }
    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
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
        if(this.getTotalDeReproducoes() > 1000) {
            return 10;
        } else if(this.getTotalDeReproducoes() > 500) {
            return 7;
        } else {
            return 5;
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
        System.out.println("Artista: " + this.getArtista());
        System.out.println("Ano de Lançamento: " + this.getAnoLancamento());
        System.out.println("Gênero Musical: " + this.getGeneroMusical());
        System.out.println("Álbum: " + this.getAlbum());
        System.out.println("Duração: " + this.getDuracao() + " minutos");
        System.out.println("Total de Reproduções: " + this.getTotalDeReproducoes());
        System.out.println("Total de Curtidas: " + this.getTotalDeCurtidas());
        System.out.println("Classificação: " + this.getClassificacao()+ "/10");
    }

}
