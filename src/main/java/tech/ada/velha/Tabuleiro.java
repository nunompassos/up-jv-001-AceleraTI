package tech.ada.velha;

import java.util.Objects;

public class Tabuleiro {
    private static final String BOARD_LINE = "_%s_|_%s_|_%s_\n";
    private static final String BOARD_END = " %s | %s | %s \n";

    private String[][] posicoes = {{"_", "_", "_"}, {"_", "_", "_"}, {" ", " ", " "}};
    private String peca1;
    private String peca2;
    private String vencedor = "Empate";

    public Tabuleiro() {
    }
    public Tabuleiro(String peca1, String peca2) {
        this.peca1 = peca1;
        this.peca2 = peca2;
    }

    public void imprimirTabuleiro() {
        for (int l = 0; l < 3; l++) {
            switch (l) {
                case 0, 1 -> System.out.printf(BOARD_LINE, posicoes[l][0], posicoes[l][1], posicoes[l][2]);
                case 2 -> System.out.printf(BOARD_END, posicoes[l][0], posicoes[l][1], posicoes[l][2]);
            }
        }
    }

    public boolean terminouJogo() {
        boolean jogoTerminou = false;

        jogoTerminou = validarLinhas();
        if (jogoTerminou) {
            return true;
        }
        jogoTerminou = validarColunas();
        if (jogoTerminou) {
            return true;
        }
        jogoTerminou = validarDiagonais();
        if (jogoTerminou) {
            return true;
        }

        jogoTerminou = true;
        String[] base = {"_", "_", " "};
        for (int i = 0; i < posicoes.length; i++) {
            for (int j = 0; j < posicoes[i].length; j++) {
                if (!posicoes[i][j].equals(peca1) && !Objects.equals(posicoes[i][j], peca2)) {
                    jogoTerminou = false;
                    break;
                }
            }
        }
        return jogoTerminou;
    }

    private boolean validarLinhas() {
        boolean linha = false;
        for (String[] l: posicoes) {
            if (l[0].equals(l[1]) && l[1].equals(l[2]) && !l[0].equals("_") && !l[0].equals(" ")) {
                linha = true;
                vencedor = l[0];
                break;
            }
        }
        return linha;
    }

    private boolean validarColunas() {
        boolean coluna = false;
        for (int i = 0; i < 3; i++) {
            if (posicoes[0][i].equals(posicoes[1][i]) &&
                posicoes[1][i].equals(posicoes[2][i]) &&
                !posicoes[0][i].equals("_") &&
                !posicoes[0][i].equals(" ")) {
                coluna = true;
                vencedor = posicoes[0][i];
                break;
            }
        }
        return coluna;
    }

    private boolean validarDiagonais() {
        if (posicoes[0][0].equals(posicoes[1][1]) &&
            posicoes[1][1].equals(posicoes[2][2]) &&
            !posicoes[0][0].equals("_") &&
            !posicoes[0][0].equals(" ")) {
            vencedor = posicoes[1][1];
            return true;
        }
        if (posicoes[0][2].equals(posicoes[1][1]) &&
            posicoes[1][1].equals(posicoes[2][0]) &&
            !posicoes[0][2].equals("_") &&
            !posicoes[0][2].equals(" ")) {
            vencedor = posicoes[1][1];
            return true;
        }

        return false;
    }

    public String[][] getPosicoes() {
        return this.posicoes;
    }

    public String getVencedor() {
        return this.vencedor;
    }
}
