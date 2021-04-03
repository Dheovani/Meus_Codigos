package br.com.abc.introdução.controledefluxo;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 14;
        String status;
        status = idade < 18 ? /*primeiro valor*/"Não adulto" : /*segundo valor*/"Adulto";
        // Sempre que utilizar o operador ternário, o primeiro valor corresponde a TRUE e o segundo a FALSE.
        System.out.println(status);
    }
}
