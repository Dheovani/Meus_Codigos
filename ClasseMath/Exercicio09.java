package FaculPOO.Março.ClasseMath;

import java.util.Scanner;

public class Exercicio09 {
    /* Desenvolva um programa em java que calcule a função de Ackley N. 2.
     * Os valores de x e y serão informados pelo usuário, onde x, y ∈ [−32, 32].
     * f(x, y) = −200 * e^(−0.2 * √(x²+y²))
     */
    public static void main(String[] args) {
        double x = -33;
        double y = 33;
        Scanner scannerDoub = new Scanner(System.in);
        System.out.println(f(x, y, scannerDoub));
    }

    public static double checkIfAcceptable(int min, int max, double valor, Scanner scanner) {
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
        x = checkIfAcceptable(-32, 32, x, scanner);
        y = checkIfAcceptable(-32, 32, y, scanner);
        return -200 * Math.exp((-0.2 * Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)))); // −200 * e^(−0.2 * √x²+y²)
    }
}
