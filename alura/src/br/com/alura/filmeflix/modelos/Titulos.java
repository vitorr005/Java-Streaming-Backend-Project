package br.com.alura.filmeflix.modelos;

public class Titulos {

    private String nome;
    private int anoDeLacamento;
    private boolean incluidoNoPlano;
    private int  totaldeVisualizacoes;
    private double somaDasavaliacoes;
    private int totalDasAvaliacao;
    private int duracaoEmMinunos;

    public int getTotalDasAvaliacao() {
        return totalDasAvaliacao;
    }

    public void exibeFilme() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLacamento);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
    }

    public void avalia(double nota) {
        somaDasavaliacoes += nota;
        totalDasAvaliacao++;
    }

    public double mediaDasAvaliacoes() {
        return somaDasavaliacoes / totalDasAvaliacao;


    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLacamento(int anoDeLacamento) {
        this.anoDeLacamento = anoDeLacamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinunos(int duracaoEmMinunos) {
        this.duracaoEmMinunos = duracaoEmMinunos;
    }

    public int getDuracaoEmMinunos() {
        return duracaoEmMinunos;
    }

    public int getTotaldeVisualizacoes() {
        return totaldeVisualizacoes;
    }

    public void setTotaldeVisualizacoes(int totaldeVisualizacoes) {
        this.totaldeVisualizacoes = totaldeVisualizacoes;
    }
}