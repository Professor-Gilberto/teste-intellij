package org.pedreira;

import org.pedreira.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Gato miau = new Gato("Fluffy","Brown",5);
        System.out.println(miau.getNome());
        System.out.println(miau.getCor());
        System.out.println(miau.getIdade());
    }
}
