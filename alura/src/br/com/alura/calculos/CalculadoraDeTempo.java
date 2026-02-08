package br.com.alura.calculos;
import br.com.alura.filmeflix.modelos.Titulos;

public class CalculadoraDeTempo{

        private int tempoTotal = 0;

        public int getTempoTotal() {
            return this.tempoTotal;
        }

        public void inclui (Titulos titulo) {
            this.tempoTotal += titulo.getDuracaoEmMinunos ();
        }

}

