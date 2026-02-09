package br.com.alura.filmeflix.modelos;
import br.com.alura.calculos.Classificavel;

public class Filme extends Titulos implements Classificavel{


    @Override
    public int getClassificacao() {
        if (getTotaldeVisualizacoes() > 100) {
            return 4 ;
        } else {
            return 2;
        }
    }





}


