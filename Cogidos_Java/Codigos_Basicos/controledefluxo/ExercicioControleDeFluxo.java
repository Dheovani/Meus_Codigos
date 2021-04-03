package br.com.abc.introdução.controledefluxo;

public class ExercicioControleDeFluxo {
    public static void main(String[] args) {
        // Crie um switch que dado um valor de 1 a 7 onde 1 corresponde a domingo e 7 a sábado
        // Imprima se o número corresponde a um dia útil ou a um final de semana
        byte dia = 1;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil.");
                break;
            default:
                System.out.println("Valor inválido!");
                break;
        }
    }
}
