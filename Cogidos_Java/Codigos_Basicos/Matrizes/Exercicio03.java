package FaculPOO.Abril.Matrizes;

import java.util.Scanner;

public class Exercicio03 {
    /* Crie um programa Java onde o usuário informe a quantidade de números que irá informar.
     * Cada número deve ser armazenado em uma posição do vetor. Calcule a média e apresente em tela.
     */
    public static void main(String[] args) {
        Scanner infoUser = new Scanner(System.in);
        System.out.println("Quantos números o vetor conterá?");
        int quantia = infoUser.nextInt();
        int[] vetor = new int[quantia];
        double soma = 0;
        for(int cont = 0; cont < vetor.length; cont ++) {
            System.out.println("Digite um valor para a posição " + cont + " do vetor.");
            vetor[cont] = infoUser.nextInt();
            soma += vetor[cont];
        }
        System.out.println("A média dos valores apresentados no vetor é: " + soma / vetor.length);
    }
}
