package br.com.alura.filmeflix.modelos;
import br.com.alura.calculos.Classificavel;

public class Filme extends Titulos implements Classificavel{

    public int getClassificacao() {
        return (int) getClassificacao() / 2;
    }

}


