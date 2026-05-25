package br.com;

import java.util.HashSet;

public class BibliotecaTeste {
    public static void main(String[] args) {
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");

        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));

        System.out.println("Hash l1: " + l1.hashCode());
        System.out.println("Hash l2: " + l2.hashCode());

        HashSet<Livro> biblioteca = new HashSet<>();
        biblioteca.add(l1);
        biblioteca.add(l2);

        System.out.println("Tamanho do Set: " + biblioteca.size());

    }
}