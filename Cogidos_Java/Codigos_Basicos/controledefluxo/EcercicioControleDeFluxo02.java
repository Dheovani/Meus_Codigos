package br.com.abc.introdução.controledefluxo;

public class EcercicioControleDeFluxo02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 100000
        int pares;
        for (pares = 0; pares <= 100000; pares++) {
            if (pares % 2 == 0 && pares != 0) {
                System.out.println(pares);
            }
        }
    }
}
