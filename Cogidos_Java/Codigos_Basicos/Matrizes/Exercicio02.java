package FaculPOO.Abril.Matrizes;

import java.util.Random;

public class Exercicio02 {
    /* Crie um programa Java que realize a soma dos valores de um vetor.
     */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] vetor = new int[10];
        int soma = 0;
        for(int j = 0; j < vetor.length; j ++) {
            vetor[j] = aleatorio.nextInt(50);
            System.out.println(vetor[j]);
            soma += vetor[j];
        }
        System.out.println(soma);
    }
}
