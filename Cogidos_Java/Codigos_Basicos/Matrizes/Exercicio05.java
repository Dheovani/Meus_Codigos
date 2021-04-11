package FaculPOO.Abril.Matrizes;

public class Exercicio05 {
    /* Crie um programa Java que imprime em tela um tabuleiro de jogo da velha.
     * Utilize a matriz para representar o tabuleiro e considere a seguinte configuração:
     * x | o |
     *   |   | x
     *   | o |
     */
    public static void main(String[] args) {
        String[][] tabuleiro = {
                {"x", "o", " "},
                {" ", " ", "x"},
                {" ", "o", " "}
        };
        for(String[] linha : tabuleiro) {
            for(int i = 0; i < linha.length; i ++) {
                if(i < (linha.length - 1)) {
                    System.out.print(linha[i] + " | ");
                } else {
                    System.out.println(linha[i]);
                }
            }
            System.out.println("---------");
        }
    }
}
