package br.com.abc.introdução.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        /* br.com.abc.introdução.operadores.Operadores lógicos
         * AND é representado por &&
         * OR é representado por ||
         * */
        int salario = 1200;
        int idade = 18;
        if (salario >= 1000 && idade >= 20) {
            System.out.println("Você pode entrar.");
        } else {
            System.out.println("Você não pode entrar.");
        }
    }
}
