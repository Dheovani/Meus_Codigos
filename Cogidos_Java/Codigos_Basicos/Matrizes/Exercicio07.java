package FaculPOO.Abril.Matrizes;

import java.util.Scanner;

public class Exercicio07 {
    /* Modifique o programa anterior, para que o usuário possa informar as matrizes que de seja informar.
     */
    public static void main(String[] args) {
        Scanner leitorMatriz = new Scanner(System.in);
        System.out.println("Informe a quantidade de linhas da primeira matriz:");
        int linhas = leitorMatriz.nextInt();
        System.out.println("Informe a quantidade de colunas da primeira matriz:");
        int colunasA = leitorMatriz.nextInt();
        System.out.println("Informe a quantidade de colunas da segunda matriz:");
        int colunasB = leitorMatriz.nextInt();
        int[][] matrizA = new int[linhas][colunasA];
        int[][] matrizB = new int[colunasA][colunasB];
        // Matrizes criadas

        System.out.println("Defina os valores da matriz A:");
        coletorDeValores(matrizA, leitorMatriz);
        System.out.println("Defina os valores da matriz B:");
        coletorDeValores(matrizB, leitorMatriz);
        // Valores adicionados às matrizes

        int[][] matrizResult = new int[linhas][colunasB];
        for(int c = 0; c < matrizResult.length; c ++) {
            // O ponteiro "c" indica em que vetor da matrizResult estamos
            for(int d = 0; d < matrizResult[c].length; d ++) {
                // O ponteiro "d" indica em que variável do vetor "c" da matrizResult estamos
                for(int e = 0; e < matrizA[c].length; e ++) {
                    // O ponteiro "e" indica em que variável do vetor "c" da matrizA estamos
                    matrizResult[c][d] += matrizA[c][e] * matrizB[e][d];
                    /* Precisamos realizar um cálculo que multiplique os valores das linhas da matrizA
                     * pelas colunas da matrizB. Sabemos que a coluna da matrizA onde encontra-se o primeiro
                     * valor utilizado no cálculo será sempre igual à linha da matrizB onde encontra-se o
                     * segundo valor que será utilizado no cálculo, portanto, basta utilizarmos o ponteiro "c"
                     * para definir a linha da matrizA onde encontra-se o primeiro valor e o ponteiro "d" para
                     * definir a coluna da matrizB onde encontra-se o segundo valor utilizado no cálculo.
                     */
                }
            }
        }
        // Valores adicionados à matrizResult

        for(int[] linha : matrizResult) {
            for(int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        // Imprimindo os valores
    }

    public static void coletorDeValores(int[][] matriz, Scanner scanner) {
        for(int i = 0; i < matriz.length; i ++) {
            for(int j = 0; j < matriz[i].length; j ++) {
                System.out.println("Defina um valor para a posição " + j + " do vetor " + i + " da matriz");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
}
