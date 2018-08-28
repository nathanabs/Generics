/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nathan
 */
public class PrintService<T> {

    List<T> lista = new ArrayList<>();

    public void addValor(T valor) {
        lista.add(valor);
    }

    public void print() {
        if (lista.isEmpty()) {
            throw new IllegalStateException("Lista vazia");
        } else {
            System.out.print("[ ");
        }
        System.out.print(lista.get(0));

        for (int i = 1; i < lista.size(); i++) {
            System.out.print(", " + lista.get(i));
        }
        System.out.print(" ]");
    }

    public T primeiroElemento() {
        if (lista.isEmpty()) {
            throw new IllegalStateException("Lista vazia");
        }
        return lista.get(0);
    }

}
