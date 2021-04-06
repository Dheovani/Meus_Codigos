package FaculPOO.Março.ClasseMath;

import java.util.Scanner;

public class Exercicio07 {
    /* Desenvolva um programa em java que calcule a função de Bukin N. 6.
     * Os valores de x e y serão informados pelo usuário, onde x ∈ [−15, −5], y ∈ [−3, 3].
     * f(x, y) = 100√(|y − 0.01x²|) + 0.01|x + 10|
     */
    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Resultado: " + f(x, y, scannerInt));
    }

    public static double whileDouble(int min, int max, double valor, Scanner scanner) {
        while(valor < min || valor > max) {
            System.out.print("Defina um valor entre " + min + " e " + max + ": ");
            valor = scanner.nextDouble();
            if(valor < min || valor > max) {
                System.out.println("O valor " + valor + " é inválido para esta variável.");
            }
        }
        // Verificando se os valores são aceitáveis
        return valor;
    }

    public static double f(double x, double y, Scanner scanner) {
        x = whileDouble(-15, -5, x, scanner);
        y = whileDouble(-3, 3, x, scanner);
        double valor = 100 * Math.sqrt(Math.abs(y - (0.01 * Math.pow(x, 2)))); // 100√(|y − 0.01x²|)
        valor += 0.01 * (Math.abs(x + 10)); // + 0.01|x + 10|
        return valor;
    }
}
