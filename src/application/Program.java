/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Scanner;
import services.PrintService;

/**
 *
 * @author Nathan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();

        System.out.print("Quantos numeros: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + " elemento : ");
            int num = sc.nextInt();
            ps.addValor(num);
        }

        ps.print();

        System.out.println("");
        System.out.println(ps.primeiroElemento());

        PrintService<String> ps2 = new PrintService<>();

        System.out.print("Quantos nomes: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + " elemento : ");
            String nome = sc.next();
            ps2.addValor(nome);
        }

        ps2.print();

        System.out.println("");
        System.out.println(ps2.primeiroElemento());
    }
}
