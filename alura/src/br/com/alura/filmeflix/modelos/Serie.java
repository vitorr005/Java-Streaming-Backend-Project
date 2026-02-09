package br.com.alura.filmeflix.modelos;

import br.com.alura.calculos.Classificavel;

public class Serie extends Titulos  {

    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisidio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisidio() {
        return minutosPorEpisidio;
    }

    public void setMinutosPorEpisidio(int minutosPorEpisidio) {
        this.minutosPorEpisidio = minutosPorEpisidio;
    }

    @Override
    public int getDuracaoEmMinunos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisidio;
    }


}
