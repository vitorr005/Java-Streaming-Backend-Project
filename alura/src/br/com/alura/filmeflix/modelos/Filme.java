package br.com.alura.filmeflix.modelos;
import br.com.alura.calculos.Classificavel;

public class Filme extends Titulos implements Classificavel{
    private int totaldeVisualizacoes;

    public int getTotaldeVisualizacoes() {
        return totaldeVisualizacoes;
    }

    public void setTotaldeVisualizacoes(int totaldeVisualizacoes) {
        this.totaldeVisualizacoes = totaldeVisualizacoes;
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


