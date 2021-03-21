package jogodaforca;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scannerPalavra = new Scanner(System.in);
        System.out.println("Digite a palavra chave: ");
        String palavra = scannerPalavra.nextLine().toLowerCase();
        char[] forca = palavra.toCharArray();
        // Acima eu escaneei a palavra e a transformei em um array de char para facilitar o processamento de dados

        for(int i = 0; i < 100; i ++) {
            System.out.println();
        }
        int tentativas = 0;
        char[] corretas = new char[forca.length];
        char[] incorretas = new char[5];
        boolean status = false;
        while((tentativas < 5) && (!Arrays.equals(corretas, forca))) {
            status = false;
            Scanner scannerLetra = new Scanner(System.in);
            System.out.println("Escolha uma letra: ");
            String letraString = scannerLetra.nextLine().toLowerCase();
            char letraEscolhida = letraString.charAt(0);
            for(int j = 0; j < forca.length; j ++) {
                if(letraEscolhida == forca[j]) {
                    corretas[j] = letraEscolhida;
                    status = true;
                    // Se a letra estiver certa, será adicionada ao vetor das corretas e alterará o valor de status
                    // Caso a última letra digitada antes de uma condição de fim de jogo ser acionada esteja correta, a condição de status será equivalente
                }
            }
            if(!status) {
                incorretas[tentativas] = letraEscolhida;
                tentativas ++;
                // Se a letra estiver errada, será adicionada ao vetor das incorretas e alterará o valor de tentativas
                // Caso a última letra digitada antes de uma condição de fim de jogo ser acionada esteja incorreta, a condição de status será equivalente
            }
            System.out.print("Letras corretas: ");
            System.out.println(corretas);
            System.out.print("Letras incorretas: ");
            System.out.println(incorretas);
        }

        if(status) {
            System.out.println("Parabéns! Você venceu!");
        } else {
            System.out.println("Que pena! Você perdeu!");
        }
    }
}
