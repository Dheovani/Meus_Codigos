package br.com.abc.introdução.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5]; // Forma comum de inicializar um array
        int[] numeros2 = {1, 2, 3, 4, 5}; // Desta forma, ao inicializar uma array, você já indica seus valores
        int[] numeros3 = new int[]{1, 2, 3, 4, 5}; // Similar a segunda forma apresentada
        int i = 0;
        for (; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        } // Loop comum para apresentar os valores do array
        for (int numero : numeros2) {
            System.out.println(numero);
        } // Método foreach
    }
}
