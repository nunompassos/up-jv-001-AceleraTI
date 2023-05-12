package tech.ada.velha;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Tabuleiro t = new Tabuleiro(new String("X"), "O");
        final Scanner sc = new Scanner(System.in);

        String pecaAntiga = "";
        boolean jogadaInvalida;

        t.imprimirTabuleiro();
        do {
            do {
                jogadaInvalida = false;
                System.out.print("Insira a sua peça e a posição (X;4): ");
                final String peca = sc.next();
                final String[] split = peca.split(";");
                if ((!"X".equals(split[0]) && !"O".equals(split[0])) || pecaAntiga.equals(split[0])) {
                    System.out.println("Peça não é válida!");
                    jogadaInvalida = true;
                    continue;
                }
                if (split[1].compareTo("0") < 0 && split[1].compareTo("9") > 0) {
                    System.out.println("Posição inválida!");
                    jogadaInvalida = true;
                    continue;
                }
                System.out.println("Jogada válida");
                pecaAntiga = split[0];
                int posicao = Integer.parseInt(split[1]);
                switch (posicao) {
                    case 1:
                        if (!t.getPosicoes()[0][0].equals("_")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        t.getPosicoes()[0][0] = pecaAntiga;
                        break;
                    case 2:
                        if (!t.getPosicoes()[0][1].equals("_")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        t.getPosicoes()[0][1] = pecaAntiga;
                        break;
                    case 3:
                        if (!t.getPosicoes()[0][2].equals("_")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        t.getPosicoes()[0][2] = pecaAntiga;
                        break;
                    case 4:
                        if (!t.getPosicoes()[1][0].equals("_")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        t.getPosicoes()[1][0] = pecaAntiga;
                        break;
                    case 5:
                        if (!t.getPosicoes()[1][1].equals("_")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        t.getPosicoes()[1][1] = pecaAntiga;
                        break;
                    case 6:
                        if (!t.getPosicoes()[1][2].equals("_")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        t.getPosicoes()[1][2] = pecaAntiga;
                        break;
                    case 7:
                        if (!t.getPosicoes()[2][0].equals(" ")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        t.getPosicoes()[2][0] = pecaAntiga;
                        break;
                    case 8:
                        if (!t.getPosicoes()[2][1].equals(" ")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        t.getPosicoes()[2][1] = pecaAntiga;
                        break;
                    case 9:
                        if (!t.getPosicoes()[2][2].equals(" ")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        t.getPosicoes()[2][2] = pecaAntiga;
                        break;
                }

            } while (jogadaInvalida);

            t.imprimirTabuleiro();
        } while (!t.terminouJogo());

        System.out.println(t.getVencedor());

    }
}
