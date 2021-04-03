package br.com.abc.introdução.arrays;

public class Arrays4 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][0] = 3;
        dias[0][1] = 4;
        // dias[1][0] não foi declarado, portanto será 0
        dias[1][1] = 8;
        /*
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(dias[i][j]);
            }
        } Método for comum
         */
        for (int[] dia : dias) {
            for (int j = 0; j < 2; j++) {
                System.out.println(dia[j]);
            }
        } // Método foreach
    }
}
