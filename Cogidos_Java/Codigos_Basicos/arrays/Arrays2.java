package br.com.abc.introdução.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        /* Os valores de inicialização de arrays são:
         * byte, int, short, long, float, double = 0
         * char = " "
         * boolean = false
         * reference (objetos) = null
         * */
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurozaki";
        nomes[2] = "Naruto";
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        } // É possível declarar uma variável que percorrerá cada um dos valores do array
        int[] num = new int[5];
        num[0] = 7;
        num[1] = 0;
        num[2] = 4;
        num[3] = 18;
        num[4] = 3;
        for (int numero : num) {
            System.out.println("Numero: " + numero);
        }
    }
}
