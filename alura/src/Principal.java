import br.com.alura.calculos.CalculadoraDeTempo;
import br.com.alura.calculos.FiltroRecomendacao;
import br.com.alura.filmeflix.modelos.Episodios;
import br.com.alura.filmeflix.modelos.Filme;
import br.com.alura.filmeflix.modelos.Serie;
import br.com.alura.filmeflix.modelos.Titulos;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme ();
        meuFilme.setNome ("Gigante de Aço");
        meuFilme.setAnoDeLacamento (2011);
        meuFilme.setDuracaoEmMinunos (127);
        meuFilme.setIncluidoNoPlano (true);
        meuFilme.setTotaldeVisualizacoes(101);



        meuFilme.exibeFilme();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(4);



        Serie minhaSerie = new Serie();

        minhaSerie.setNome("The Walking Dead");
        minhaSerie.setAnoDeLacamento(2010);
        minhaSerie.setIncluidoNoPlano(true);
        minhaSerie.setTemporadas(11);
        minhaSerie.setEpisodiosPorTemporada(12);
        minhaSerie.setMinutosPorEpisidio(60);




        minhaSerie.exibeFilme();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(meuFilme);



        Episodios primeiro = new Episodios();
        primeiro.setEpisodio(1);
        primeiro.setSerie(minhaSerie);
        primeiro.setTotaldeVisualizacoes(300);

        var filme = new ArrayList<>();
        filme.add(meuFilme);
        filme.add(minhaSerie);
        System.out.println("Lista de filme :" + filme);





    }
}
