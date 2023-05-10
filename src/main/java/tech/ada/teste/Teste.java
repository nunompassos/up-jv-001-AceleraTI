package tech.ada.teste;

import java.util.Arrays;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int idade = 7;

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
        char[] teste2 = teste.toCharArray();
        for (char c: teste2) {
            System.out.println(c);
        }

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
