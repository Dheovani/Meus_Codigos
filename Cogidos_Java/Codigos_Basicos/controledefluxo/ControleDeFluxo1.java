package br.com.abc.introdução.controledefluxo;

public class ControleDeFluxo1 {
    public static void main(String[] args) {
        /* idade < 15 = categoria infantil
         *  idade >= 15 && idade < 18 = categoria juvenil
         *  idade >= 18 = categoria adulto
         * */
        int idade = 18;
        String categoria;
        if (idade < 15) {
            categoria = "infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "juvenil";
        } else {
            categoria = "adulto";
        }
        System.out.println("O indivíduo pertence à categoria: " + categoria);
        /* Representando por operador ternário:
         * categoria = idade < 15 ? "Infantil" : idade >= 15 && idade < 18 ? "Juvenil" : "Adulto" ;
         * */
    }
}
