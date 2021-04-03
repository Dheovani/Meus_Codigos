package br.com.abc.introdução.controledefluxo;

public class ControleDeFluxo3 {
    public static void main(String[] args) {
        byte dia = 5;
        // char, int, byte, short, enum e String
        // if (dia == 1) {
        //     System.out.println("Domingo.");
        // } else if (dia == 2) {
        //     System.out.println("Segunda.");
        // } else if (dia == 3) {
        //     System.out.println("Terça.");
        // } else if (dia == 4) {
        //     System.out.println("Quarta.");
        // } else if (dia == 5) {
        //     System.out.println("Quinta.");
        // } else if (dia == 6) {
        //     System.out.println("Sexta.");
        // } else {
        //     System.out.println("Sábado.");
        // }
        switch (dia) { // A ferramenta switch realiza a mesma função de controle de fluxo que as ferramentas IF, ELSE IF E ELSE.
            case 1: // Os case options são utilizados para determinar opções de valores válidos na ferramenta switch.
                System.out.println("Domingo.");
                break;
            case 2:
                System.out.println("Segunda.");
                break;
            case 3:
                System.out.println("Terça.");
                break;
            case 4:
                System.out.println("Quarta.");
                break;
            case 5:
                System.out.println("Quinta.");
                break;
            case 6:
                System.out.println("Sexta.");
                break;
            case 7:
                System.out.println("Sábado.");
                break;
            default: // A opção default é utilizada quando nenhum dos case options é válido.
                System.out.println("Opção inválida.");
                break;
        }
    }
}
