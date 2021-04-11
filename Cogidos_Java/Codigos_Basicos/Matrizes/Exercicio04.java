package FaculPOO.Abril.Matrizes;

public class Exercicio04 {
    /* Crie um programa Java e declare um matriz de 2 dimensões. Inicialize a matriz com diferentes
     * números para cada uma das suas posições e apresente em tela.
     * 1 2 3
     * 3 2 1
     * 2 1 0
     */
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {3, 2, 1},
                {2, 1, 0}
        };
        for(int[] vetor : matriz) {
            for(int valor : vetor) {
                System.out.print(valor);
            }
            System.out.println();
        }
    }
}
