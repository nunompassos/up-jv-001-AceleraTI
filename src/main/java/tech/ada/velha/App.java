package tech.ada.velha;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String p1, p2, p3, p4, p5, p6;
        p1 = p2 = p3 = p4 = p5 = p6 = "_";
        String p7, p8, p9;
        p7 = p8 = p9 = " ";
        String boardLine = "_%s_|_%s_|_%s_\n";
        String boardEnd = " %s | %s | %s \n";
        String pecaAntiga = "";
        boolean jogadaInvalida;

        System.out.printf(boardLine, p1, p2, p3);
        System.out.printf(boardLine, p4, p5, p6);
        System.out.printf(boardEnd, p7, p8, p9);

        final Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            do {
                jogadaInvalida = false;
                System.out.print("Insira a sua peça e a posição (x;4): ");
                final String peca = sc.next();
                final String[] split = peca.split(";");
                if ((!"x".equals(split[0]) && !"o".equals(split[0])) || pecaAntiga.equals(split[0])) {
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
                        if (!p1.equals("_")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        p1 = pecaAntiga;
                        break;
                    case 2:
                        if (!p2.equals("_")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        p2 = pecaAntiga;
                        break;
                    case 3:
                        if (!p3.equals("_")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        p3 = pecaAntiga;
                        break;
                    case 4:
                        if (!p4.equals("_")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        p4 = pecaAntiga;
                        break;
                    case 5:
                        if (!p5.equals("_")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        p5 = pecaAntiga;
                        break;
                    case 6:
                        if (!p6.equals("_")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        p6 = pecaAntiga;
                        break;
                    case 7:
                        if (!p7.equals(" ")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        p7 = pecaAntiga;
                        break;
                    case 8:
                        if (!p8.equals(" ")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        p8 = pecaAntiga;
                        break;
                    case 9:
                        if (!p9.equals(" ")) {
                            System.out.println("Posição não válida");
                            jogadaInvalida = true;
                            continue;
                        }
                        p9 = pecaAntiga;
                        break;
                }

            } while (jogadaInvalida);
            // p1 = peca;

            System.out.printf(boardLine, p1, p2, p3);
            System.out.printf(boardLine, p4, p5, p6);
            System.out.printf(boardEnd, p7, p8, p9);
        }

    }
}
