package tech.ada.velha;

import java.util.Objects;

public class Tabuleiro {
    private static final String BOARD_LINE = "_%s_|_%s_|_%s_\n";
    private static final String BOARD_END = " %s | %s | %s \n";

    final private String[][] posicoes = {{"_", "_", "_"}, {"_", "_", "_"}, {" ", " ", " "}};
    final private String peca1;
    final private String peca2;

    private String pecaAntiga = "";
    private String vencedor = "Empate";
    private String pecaAtual = "";
    private int posicaoAtual = -1;

    public Tabuleiro(String peca1, String peca2) {
        this.peca1 = peca1;
        this.peca2 = peca2;
    }

    public String getPeca1() {
        return this.peca1;
    }

    public String getPeca2() {
        return this.peca2;
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
        boolean jogoTerminou;

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
        for (String[] posicao : posicoes) {
            for (String s : posicao) {
                if (!s.equals(peca1) && !Objects.equals(s, peca2)) {
                    jogoTerminou = false;
                    break;
                }
            }
        }
        return jogoTerminou;
    }

    private boolean validarLinhas() {
        boolean linha = false;
        for (String[] l : posicoes) {
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
            if (posicoes[0][i].equals(posicoes[1][i]) && posicoes[1][i].equals(posicoes[2][i]) && !posicoes[0][i].equals("_") && !posicoes[0][i].equals(" ")) {
                coluna = true;
                vencedor = posicoes[0][i];
                break;
            }
        }
        return coluna;
    }

    private boolean validarDiagonais() {
        if (posicoes[0][0].equals(posicoes[1][1]) && posicoes[1][1].equals(posicoes[2][2]) && !posicoes[0][0].equals("_") && !posicoes[0][0].equals(" ")) {
            vencedor = posicoes[1][1];
            return true;
        }
        if (posicoes[0][2].equals(posicoes[1][1]) && posicoes[1][1].equals(posicoes[2][0]) && !posicoes[0][2].equals("_") && !posicoes[0][2].equals(" ")) {
            vencedor = posicoes[1][1];
            return true;
        }

        return false;
    }

    public String getVencedor() {
        if (this.vencedor.equals(this.peca1)) {
            return "O jogador 1 venceu o jogo!";
        }
        return this.vencedor.equals(this.peca2) ? "O jogador 2 venceu o jogo!" : "O jogo terminou empatado!";
    }

    public boolean validaJogada(final String jogada) {

        final String[] jogadas = jogada.split(";");
        if("".equals(pecaAntiga) && !peca1.equals(jogadas[0])) {
            System.out.println("Peça não é válida!");
            return false;
        }
        if ((!peca1.equals(jogadas[0]) && !peca2.equals(jogadas[0])) || pecaAntiga.equals(jogadas[0])) {
            System.out.println("Peça não é válida!");
            return false;
        }
        if (jogadas[1].compareTo("0") < 0 && jogadas[1].compareTo("9") > 0) {
            System.out.println("Posição inválida!");
            return false;
        }
        pecaAtual = jogadas[0];
        posicaoAtual = Integer.parseInt(jogadas[1]);

        return validaPosicao();
    }

    private boolean validaPosicao() {
        boolean result = true;
        switch (posicaoAtual) {
            case 1 -> result = posicoes[0][0].equals("_");
            case 2 -> result = posicoes[0][1].equals("_");
            case 3 -> result = posicoes[0][2].equals("_");
            case 4 -> result = posicoes[1][0].equals("_");
            case 5 -> result = posicoes[1][1].equals("_");
            case 6 -> result = posicoes[1][2].equals("_");
            case 7 -> result = posicoes[2][0].equals(" ");
            case 8 -> result = posicoes[2][1].equals(" ");
            case 9 -> result = posicoes[2][2].equals(" ");
        }
        if (!result) {
            System.out.println("Posição não válida");
            return false;
        }
        return true;
    }

    public void aplicarJogada() {
        pecaAntiga = pecaAtual;
        switch (posicaoAtual) {
            case 1 -> posicoes[0][0] = pecaAtual;
            case 2 -> posicoes[0][1] = pecaAtual;
            case 3 -> posicoes[0][2] = pecaAtual;
            case 4 -> posicoes[1][0] = pecaAtual;
            case 5 -> posicoes[1][1] = pecaAtual;
            case 6 -> posicoes[1][2] = pecaAtual;
            case 7 -> posicoes[2][0] = pecaAtual;
            case 8 -> posicoes[2][1] = pecaAtual;
            case 9 -> posicoes[2][2] = pecaAtual;
        }
    }

    @Override
    public String toString() {
        return "ola " + super.toString();
    }
}
