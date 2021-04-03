package br.com.abc.introdução.operadores;

public class Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1 + numero2;//Para chegar a um resultado, posso utilizar uma terceira variável
        System.out.println("A soma é " + soma);
        System.out.println("A subtração é " + (numero1 - numero2));//Posso utilizar parenteses para efetuar o cálculo
        System.out.println("A divisão é " + (numero1 / numero2));//O resultado será zero, pois 10/20 é 0.5 e a divisão de variáveis inteiras sempre resultará em um número inteiro
        System.out.println("A divisão é " + (numero2 / numero1));
        System.out.println("A multiplicação é " + numero1 * numero2);
        System.out.println("Resto da divisão é " + numero1 % 2);//Resto de divisões é representado por %
        System.out.println(numero1 > numero2);//Operador de comparação. Resultado será falso.

        /* br.com.abc.introdução.operadores.Operadores comparativos
         * > maior que
         * < menor que
         * >= maior ou igual
         * <= menor ou igual
         * == igual
         * != diferente
         * */
    }
}
