package tech.ada.teste;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int idade = 7;
        TesteEnum e = TesteEnum.TEST_1;

        BigDecimal g = new BigDecimal(1);
        StringBuilder sb = new StringBuilder().append('C');

        int i[] = {1, 2};
        Arrays.stream(i).forEach(System.out::print);
        System.out.println();
        System.out.println();
        int j[][] = {{1, 2}, {3, 4}};
        for (int a = 0; a < 2; a++) {
            for(int b = 0; b < 2; b++) {
                System.out.print(j[a][b]);
            }
            System.out.println();
        }
        System.out.println();
        int k[][][] = {{{1, 2}, {3, 4}},{{5, 6}, {7, 8}}};
        for (int a = 0; a < 2; a++) {
            for(int b = 0; b < 2; b++) {
                for (int c= 0; c < 2; c++){
                    System.out.print(k[a][b][c]);
                }
                System.out.println();
            }
        }

        /*for (int i = 0; i < 10; i++){
            System.out.println(i);
            if (i == 6) {
                System.out.println("Idade Escolar");
            }
        }*/

        String teste = "Olán mundo, eu estou vivo!";
        //String[] palavrasDaFrase = teste.split(" ");
        //Arrays.stream(palavrasDaFrase).forEach(System.out::println);
        //System.out.println(teste.substring(0, 3));
  /*      char[] teste2 = teste.toCharArray();
        for (char c: teste2) {
            System.out.println(c);
        }
*/
        boolean flag = true;
        /*while(flag) {
            System.out.print("Insira um numero: ");
            Scanner sc = new Scanner(System.in);
            if (5 == sc.nextInt()) {
                flag = false;
            }
        }*/
        /*Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Insira um numero: ");
        } while (5 != sc.nextInt());*/

        /*if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        } */
        //System.out.printf("%s de idade", idade >= 18 ? "Maior" : "Menor");
        /*String c = "Olá";
        switch (c) {
            case "Olá":
                System.out.println("Aprender a conduzir");
            case "Adeus":
                System.out.println("Escola Básica");
                break;
            case "A":
                System.out.println("Lar");
            default:
                System.out.println("Estou bem");
        }*/

        /*if (idade == 18) {
            System.out.println("Aprender a conduzir");
        }
        if (idade == 6 && idade == 18) {
            System.out.println("Escola Básica");
        } else {
            if (idade == 80) {
                System.out.println("Lar");
            }
            System.out.println("Estou bem");
        }*/


    }
}
