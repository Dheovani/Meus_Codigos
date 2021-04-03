package jogodaforca;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForcaString {
    public static void main(String[] args) {
        Scanner forcaScanner = new Scanner(System.in);
        System.out.println("Digite palavra secreta: ");
        String forca = forcaScanner.nextLine().toLowerCase();

        for(int range = 0; range < 100; range ++){
            System.out.println();
        }

        String[] forcaArray = forca.split("");
        String[] corretas = new String[forca.length()];
        String[] incorretas = new String[5];
        int tentativas = 0;
        boolean status = false;
        while(tentativas < 5 && !Arrays.equals(corretas, forcaArray)) {
            Scanner letraScanner = new Scanner(System.in);
            System.out.println("Escolha uma letra: ");
            String letra = letraScanner.nextLine().toLowerCase();
            if(Arrays.asList(corretas).contains(letra)) {
                System.out.println("Você já escolheu essa letra. Tente novamente.");
            } else if (Arrays.asList(incorretas).contains(letra)) {
                System.out.println("Você já escolheu essa letra. Tente novamente.");
            } else {
                if(forca.contains(letra)) {
                    for(int posicao = 0; posicao < forca.length(); posicao ++) {
                        if(letra.equals(String.valueOf(forca.charAt(posicao)))) {
                            corretas[posicao] = letra;
                            status = true;
                        }
                    }
                } else {
                    incorretas[tentativas] = letra;
                    status = false;
                    tentativas ++;
                }
                System.out.print("Letras corretas: ");
                System.out.println(Arrays.toString(corretas));
                System.out.print("Letras incorretas: ");
                System.out.println(Arrays.toString(incorretas));
            }
        }

        if(status) {
            System.out.println("Parabéns, você venceu!");
        } else {
            System.out.println("Que pena! Você perdeu.");
        }
    }
}
