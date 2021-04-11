package FaculPOO.Abril.Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio07 {
    /* Modifique o programa anterior, para que o usuário possa informar as matrizes que de seja informar.
     */
    public static void main(String[] args) {
        Scanner leitorMatriz = new Scanner(System.in);
        System.out.println("Informe a quantidade de linhas da primeira matriz:");
        int linhas = leitorMatriz.nextInt();
        System.out.println("Informe a quantidade de colunas da primeira matriz:");
        int colunas = leitorMatriz.nextInt();
        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizB = new int[colunas][linhas];
        // Matrizes criadas

        System.out.println("Defina os valores da matriz A:");
        coletorDeValores(matrizA, leitorMatriz);
        System.out.println("Defina os valores da matriz B:");
        coletorDeValores(matrizB, leitorMatriz);
        // Valores adicionados às matrizes

        int[][] matrizResult = new int[linhas][linhas];
        for(int c = 0; c < matrizResult.length; c ++) {
            for(int d = 0; d < matrizResult[c].length; d ++) {
                for(int e = 0; e < matrizA[c].length; e ++) {
                    matrizResult[c][d] += matrizA[c][e] * matrizB[e][d];
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
