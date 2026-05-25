package br.com;

public class Produto {
    private String nome;
    private double preco;

    // Construtor com os dois atributos
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // @Override do Exercício 2
    @Override
    public String toString() {
        return "Produto{nome='" + nome + "', preco=" + preco + "}";
    }
}