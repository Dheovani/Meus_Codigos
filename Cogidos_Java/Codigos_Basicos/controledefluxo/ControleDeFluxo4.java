package br.com.abc.introdução.controledefluxo;

public class ControleDeFluxo4 {
    public static void main(String[] args) {
        int contador = 0;
        // Estrutura de repetição WHILE comum
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }
        /* A estrutura de repetição DO WHILE executará o código ao menos uma vez
         * quer a condição imposta seja verdadeira ou não
         * */
        do {
            System.out.println("Nothing;");
            contador++;
        } while (contador > 16 && contador < 15); // Condição impossível para testar o DO WHILE
        // Estrutura de repetição FOR comum
        for (int i = 0; i < 5; i++) { // FOR (identifique a variável; identifique a condição; identifique a valoração da variável)
            System.out.println("I corresponde a " + i);
        }
    }
}
