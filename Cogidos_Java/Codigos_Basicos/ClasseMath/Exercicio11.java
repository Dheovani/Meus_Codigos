package FaculPOO.Março.ClasseMath;

import java.util.Scanner;

public class Exercicio11 {
    /* Desenvolva um programa em java que calcule a função de Cross-in-Tray.
     * Os valores de x e y serão informados pelo usuário, onde x, y ∈ [−10, 10].
     * f(x, y) = −0.0001 * (|sin(x) * sin(y) * exp(|100 − √(x² + y²) / π|)| + 1)^0.1
     */
    public static void main(String[] args) {
        double x = -11;
        double y = -11;
        Scanner scannerEx11 = new Scanner(System.in);
        System.out.println(f(x, y, scannerEx11));
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
        x = checkIfAcceptable(-10, 10, x, scanner);
        y = checkIfAcceptable(-10, 10, y, scanner);
        double valor = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); // √(x² + y²)
        valor = Math.abs(100.0 - (valor / Math.PI)); // |100 − valor / π|
        valor = Math.abs(Math.sin(x) * Math.sin(y) * Math.exp(valor)) + 1.0; // |sin(x) * sin(y) * exp(valor)| + 1
        return -0.0001 * Math.pow(valor, 0.1); // −0.0001 * (valor)^0.1
    }
}
