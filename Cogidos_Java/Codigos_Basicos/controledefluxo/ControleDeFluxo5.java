package br.com.abc.introdução.controledefluxo;

public class ControleDeFluxo5 {
    public static void main(String[] args) {
        /* Dado o determinado valor de um carro, descubra em quantas vezes ele pode ser parcelado
         * O valor das parcelas não pode ser inferior a mil reais
         * */
        double valorDoCarro = 32759;
        for (int parcelas = 1; parcelas < valorDoCarro; parcelas++) {
            double valorDaParcela = valorDoCarro / parcelas;
            if (valorDaParcela >= 1000) {
                System.out.println("O valor total da parcela, caso sejam efetuados " + parcelas + " pagamentos, será de " + valorDaParcela);
            } else {
                break;
            }
        }
    }
}
