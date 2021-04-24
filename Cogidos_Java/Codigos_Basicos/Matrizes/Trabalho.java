package FaculPOO.Abril.Matrizes;

public class Trabalho {
    /*
     * Crie um método estático que recebe uma matriz e que faça a rotação de acordo com o angulo informado.
     * Por exemplo:
     * matriz =
     * {{2, 3},
     * {4, 5}}
     * rotacionar 90 graus
     * resultado:
     * matriz =
     * {{4, 2},
     * {5, 3}}
     * Graus permitidos
     * 0, 90, 180, 270 e 360
     * Rotacione sempre no sentido horário.
     * Considere apenas matrizes quadradas.
     * Anexe na ferramenta o link para o seu repositório no github.
     */
    public static void main(String[] args) {
        int[][] matriz3x3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matriz4x4 = {
                {7, 9, 16, 10},
                {15, 22, 41, 13},
                {14, 81, 72, 8},
                {4, 0, 69, 12}
        };
        int[][] matriz5x5 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        print(matriz4x4);
        System.out.println();
        matriz4x4 = rotacionarMatriz(matriz4x4, 90);
        System.out.println();
        matriz4x4 = rotacionarMatriz(matriz4x4, 180);
        System.out.println();
        matriz4x4 = rotacionarMatriz(matriz4x4, 90);
    }

    public static int[][] rotacionarMatriz(int[][] matriz, int graus) {
        if(matriz.length != matriz[0].length) {
            System.out.println("Tamanho da matriz inválido.");
        } else if(graus != 0 && graus != 90 && graus != 180 && graus != 270 && graus != 360) {
            System.out.println("Ângulo inválido.");
            // Acima, defini as condições necessárias para o funcionamento do código
        } else {
            switch(graus) {
                case 0:
                    System.out.println("Rotação não iniciada.");
                    break;
                // Ângulo 0 não gera alterações
                case 90:
                    matriz = rotNovnGr(matriz);
                    break;
                case 180:
                    matriz = rotCentGr(matriz);
                    break;
                case 270:
                    matriz = rotDuzGr(matriz);
                    break;
                case 360:
                    System.out.println("A matriz completou o processo de rotação.");
                    break;
                // Ângulo 360 não gera alterações
                default:
                    System.out.println("Um erro ocorreu. Tente novamente.");
            }
            print(matriz);
        }
        return matriz;
    }

    public static void print(int[][] matriz) {
        for(int[] array : matriz) {
            for(int variavel : array) {
                System.out.print(variavel + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotNovnGr(int[][] matriz) {
        int[][] matrizNovn = new int[matriz.length][matriz.length];
        for(int array = 0; array < matriz.length; array++) {
            for(int variavel = 0; variavel < matriz[array].length; variavel++) {
                matrizNovn[variavel][array] = matriz[matriz.length - (1 + array)][variavel];
            }
        }
        /* Criei uma matriz auxiliar e adicionei os valores à ela na ordem correta.
         * Para que o processo funcione com ângulos diferentes, é necessário apenas rotacionar
         * novamente uma matriz já rotacionada.
         */
        return matrizNovn;
    }

    public static int[][] rotCentGr(int[][] matriz) {
        int[][] matrizCent = new int[matriz.length][matriz.length];
        for(int array = 0; array < matriz.length; array++) {
            for(int variavel = 0; variavel < matriz[array].length; variavel++) {
                matrizCent[array][variavel] = matriz[matriz.length - (1 + array)][matriz.length - (1 + variavel)];
            }
        }
        return matrizCent;
    }

    public static int[][] rotDuzGr(int[][] matriz) {
        int[][] matrizDuz = new int[matriz.length][matriz.length];
        for(int array = 0; array < matriz.length; array++) {
            for (int variavel = 0; variavel < matriz[array].length; variavel++) {
                matrizDuz[array][variavel] = matriz[variavel][matriz.length - (1 + array)];
            }
        }
        return matrizDuz;
    }
}
