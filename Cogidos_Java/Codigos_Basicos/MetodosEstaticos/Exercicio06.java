package FaculPOO.Abril.MetodosEstaticos;

public class Exercicio06 {
    /* Crie um método estático que receba por parâmetro dois vetores. O método deverá juntar
     * os dois vetores afim de montar uma matriz e retonar o resultado.
     * Exemplo:
     * Vetor A = {1,2,3} e Vetor B = {3, 5, 6} o resultado será a matriz M = { {1,2,3}, {3, 5, 6} };
     */
    public static void main(String[] args) {
        int[] vetorA = {1, 5, 9};
        int[] vetorB = {2, 5, 8};
        print(juntarVetores(vetorA, vetorB));
    }

    public static int[][] juntarVetores(int[] vetorA, int[] vetorB) {
        return new int[][]{vetorA, vetorB};
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
