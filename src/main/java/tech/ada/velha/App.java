package tech.ada.velha;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        Tabuleiro t = null;
        boolean jogoValido = false;
        while(!jogoValido) {
            System.out.println("Tipo de Jogo: ");
            System.out.println("1 - Clássico");
            System.out.println("2 - Customizado");
            final String tipoJogo = sc.nextLine();
            switch (tipoJogo) {
                case "1" -> {
                    t = new TabuleiroClassico();
                    jogoValido = true;
                }
                case "2" -> {
                    System.out.print("Insira a primeira peça: ");
                    final String peca1 = sc.nextLine();
                    System.out.println();
                    System.out.print("Insira a segunda peça: ");
                    final String peca2 = sc.nextLine();
                    t = new Tabuleiro(peca1, peca2);
                    jogoValido = true;
                }
            }
        }

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
