package jogodaforca;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a palavra secreta!");
        String forca = sc.nextLine();
        // Sistema de input/scanner
        for (int cont = 0; cont <= 100; cont++) {
            System.out.println();
        }
        // Dei 100 prints para evitar que o jogador que deve acertar a palavra possa vê-la
        char[] letras = new char[forca.length()];
        for (int cont = 0; cont < forca.length(); cont++) {
            letras[cont] = forca.charAt(cont);
        }
        // O vetor seguido de um loop acima foram utilizados para transformar a variável da palavra secreta em um vetor CHAR
        char[] letrasCorretas = new char[forca.length()]; // Este vetor será utilizado para armazenar as letras corretas
        char[] letrasIncorretas = new char[26]; // Este vetor será utilizado para armazenar as letras incorretas
        int tentativas = 0; // Este vetor limitará o número de chances do jogador
        while (tentativas <= forca.length() + 5) {
            // Enquanto a variável tentativas for menor que o número de letras na variável forca + 5, o loop se mantém
            if (Arrays.equals(letrasCorretas, letras)) {
                break;
                // Se o array letrasCorretas corresponder à palavra cecreta, o código é quebrado
            }
            Scanner co = new Scanner(System.in);
            System.out.println("Escolha uma letra!");
            String letraEscolhida = co.nextLine();
            boolean existe = false; // Essa variável será usada para determinar se a letra tentada vai para o vetor das corretas ou erradas
            /* Aqui eu vou precisar transformar a variável letraEscolhida em um char para poder utilizá-la mais a frente
             * vou utilizar o mesmo mecanismo aplicado para a variável forca
             * */
            char[] letraEscolhidaCHAR = new char[1];
            letraEscolhidaCHAR[0] = letraEscolhida.charAt(0);
            // Tendo transformado a variável letraEscolhida em um char, posso transmitir a variável entre vetores
            for (int posicao = 0; posicao < forca.length(); posicao++) {
                if (forca.charAt(posicao) == letraEscolhidaCHAR[0]) {
                    existe = true;
                    break;
                } // Esse loop direcionado será utilizado para definir se a letra selecionada faz parte da palavra secreta
            }
            if (existe) {
                for (int corrigir = 0; corrigir < forca.length(); corrigir++) {
                    if (forca.charAt(corrigir) == letraEscolhidaCHAR[0]) {
                        letrasCorretas[corrigir] = letraEscolhidaCHAR[0];
                    } // Caso a letra faça parte da palavra secreta, ela será adicionada ao vetor letrasCorretas na mesma posição que ocupa na palavra secreta
                }
            } else {
                letrasIncorretas[tentativas] = letraEscolhidaCHAR[0];
            } // Caso a letra não faça parte da palavra secreta, ela será adicionada ao vetor letrasIncorretas
            tentativas++;
            System.out.println("Corretas: " + Arrays.toString(letrasCorretas));
            System.out.println("Incorretas: " + Arrays.toString(letrasIncorretas));
            // Os prints acima são apenas indicadores das letras já selecionadas
        }
        String resultado;
        if (Arrays.equals(letras, letrasCorretas)) {
            resultado = "venceu";
        } else {
            resultado = "perdeu";
        } // O controle de fluxo acima define que mensagem será apresentada ao jogador de acordo com o resultado da partida
        System.out.println("Fim de jogo. Você " + resultado + "!");
    }
}
