package br.com.alura.filmeflix.modelos;

import br.com.alura.calculos.Classificavel;

public class Episodios implements Classificavel {

    private int totaldeVisualizacoes;
    private int episodio;
    private String serie;

    public int getEpisodio() {
        return episodio;
    }

    public void getSerie() {
        return;
    }

    public void setSerie(Serie minhaSerie) {
        this.serie = serie;
    }

    public int getTotaldeVisualizacoes() {
        return totaldeVisualizacoes;
    }

    public void setTotaldeVisualizacoes(int totaldeVisualizacoes) {
        this.totaldeVisualizacoes = totaldeVisualizacoes;
    }

    public int getepisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        episodio = episodio;
    }

    @Override
    public int getClassificacao() {
        if (totaldeVisualizacoes > 100) {
            return 4 ;
        } else {
            return 2;
        }
    }
}
