package FaculPOO.Abril.Matrizes;

import java.util.Arrays;
import java.util.Random;

public class Exercicio01 {
    /* Crie um programa Java que crie um arranjo de 10 posições. Em cada posição atribui um valor
     * diferente de Zero e apresente em tela.
     */
    public static void main(String[] args) {
        int[] valores = new int[10];
        Random aleatorio = new Random();
        for(int i = 0; i < valores.length; i ++) {
            int num = aleatorio.nextInt(50);
            if(num > 0){
                valores[i] = num;
                System.out.println(valores[i]);
            } else {
                i --;
            }
        }
        System.out.println(Arrays.toString(valores));
    }
}
