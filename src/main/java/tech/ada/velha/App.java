package tech.ada.velha;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Tabuleiro t = new Tabuleiro(new String("X"), "O");
        final Scanner sc = new Scanner(System.in);

        boolean jogadaInvalida;

        t.imprimirTabuleiro();
        do {
            do {
                jogadaInvalida = false;
                System.out.print("Insira a sua peça e a posição (X;4): ");
                final String jogada = sc.next();
                if (!t.validaJogada(jogada)) {
                    jogadaInvalida = true;
                    continue;
                }
                System.out.println("Jogada válida");
                t.aplicarJogada();

            } while (jogadaInvalida);

            t.imprimirTabuleiro();
        } while (!t.terminouJogo());

        System.out.println(t.getVencedor());

    }
}
