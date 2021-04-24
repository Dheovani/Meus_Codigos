package FaculPOO.Abril.MetodosEstaticos;

public class Exercicio04 {
    /* Crie um método estático que receba por parâmetro uma matriz de números inteiros e
     * imprima em tela o seu conteúdo.
     */
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        print(matriz);
    }

    public static void print(int[][] matriz) {
        for(int[] array : matriz) {
            for(int variavel : array) {
                System.out.print(variavel + " ");
            }
            System.out.println();
        }
    }
}
