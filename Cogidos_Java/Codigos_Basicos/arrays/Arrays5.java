package br.com.abc.introdução.arrays;

public class Arrays5 {
    public static void main(String[] args) {
        /* Método para identificar os valores do array
        int[][] dias = new int[3][];
        dias[0] = new int[2];
        dias[1] = new int[]{1, 2, 3};
        dias[2] = new int[4];
         */
        int[][] dias = {{0, 0}, {1, 2, 3}, {0, 0, 0, 0}};
        // Acima, identifiquei todos os valores do array durante sua criação
        for (int[] arr : dias) {
            for (int num : arr) {
                System.out.println(num);
            }
        }
    }
}
