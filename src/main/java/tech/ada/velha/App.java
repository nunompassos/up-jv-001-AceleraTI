package tech.ada.velha;

import java.util.Scanner;

public class App {

    private Tabuleiro t;
    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        final App app = new App();
        app.iniciar();

    }

    public void iniciar() {
        boolean novoJogo;
        do {
            t = definirTabuleiro();
            jogar();
            System.out.println(t.getVencedor());
            novoJogo = repetirJogo();
        } while (novoJogo);
    }

    private Tabuleiro definirTabuleiro() {
        while (true) {
            System.out.println("Tipo de jogo:");
            System.out.println("1 - Clássico");
            System.out.println("2 - Personalizado");
            System.out.print("Insira o tipo de tabuleiro: ");
            final String tabuleiro = sc.nextLine();
            switch (tabuleiro) {
                case "1" -> {
                    return new TabuleiroClassico();
                }
                case "2" -> {
                    final String p1, p2;
                    System.out.print("Insira a primeira peça: ");
                    p1 = sc.nextLine();
                    System.out.print("Insira a segunda peça: ");
                    p2 = sc.nextLine();
                    return new Tabuleiro(p1, p2);
                }
            }
        }
    }

    private void jogar() {
        t.imprimirTabuleiro();
        for (int i = 1; !t.terminouJogo(); i++) {
            jogada(i);
            t.imprimirTabuleiro();
        }
    }

    private void jogada(int i) {
        boolean jogadaInvalida = true;
        while (jogadaInvalida) {
            System.out.printf("Insira a sua peça e a posição - %s;2: ", i%2 == 0 ? t.getPeca2() : t.getPeca1());
            final String jogada = sc.nextLine();
            if (t.validaJogada(jogada)) {
                System.out.println("Jogada válida!");
                t.aplicarJogada();
                jogadaInvalida = false;
            }
        }
    }

    private boolean repetirJogo() {
        while (true) {
            System.out.print("Deseja repetir o jogo? (s/n): ");
            final String res = sc.nextLine();
            switch (res) {
                case "s" -> {
                    return true;
                }
                case "n" -> {
                    return false;
                }
            }
        }
    }
}
