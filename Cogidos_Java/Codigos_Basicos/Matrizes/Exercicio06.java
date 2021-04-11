package FaculPOO.Abril.Matrizes;

public class Exercicio06 {
    /* Crie um programa java que realize a multiplicação de matrizes e apresente o resultado final.
     * Utilize as matrizes A e B abaixo. Confira os detalhes da multiplicação de matrizes em
     * https://www.somatematica.com.br/emedio/matrizes/matrizes4.php.
     * A = {{1, 2}, {3, 4}}
     * B = {{-1, 3}, {4, 2}}
     */
    public static void main(String[] args) {
        int[][] matrizA = {
                {1, 2},
                {3, 4}
        };
        int[][] matrizB = {
                {-1, 3},
                {4, 2}
        };
        int[][] matrizResult = new int[2][2];
        for(int a = 0; a < matrizResult.length; a ++) {
            for(int b = 0; b < matrizResult[a].length; b ++) {
                for(int c = 0; c < matrizA[a].length; c ++) {
                    matrizResult[a][b] += matrizA[a][c] * matrizB[c][b];
                }
            }
        }
        for(int[] linha : matrizResult) {
            for(int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
