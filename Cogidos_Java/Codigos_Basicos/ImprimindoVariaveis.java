package br.com.abc.introdução;

// Comentário de uma única linha é representado por //
/* Comentário de
multiplas
 linhas */
public class ImprimindoVariaveis {
    public static void main(String[] args) {
        int idadeDosPaisParaCadastro = 30; /*Para chamar variável, devo primeiro identificar o tipo primitivo dela*/
        /*Variáveis devem ter a primeira letra minúcula. Nomes composto tem as demais primeiras letras maiúsculas*/
        double salarioDouble = 3000;
        float salarioFloat = 3000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 10001;
        char caractere = 95;//2 bytes
        String nome = "William";
        System.out.println("A idade mínima é de " + idadeDosPaisParaCadastro + " anos.");
    }
}
