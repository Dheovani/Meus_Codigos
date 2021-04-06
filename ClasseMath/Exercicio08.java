package FaculPOO.Março.ClasseMath;

import java.util.Scanner;

public class Exercicio08 {
    /* Desenvolva um programa em java que calcule a função de Wolfe. Os valores de
     * x, y e z serão informados pelo usuário, onde x, y, z ∈ [0, 2].
     * f(x, y, z) = 4/3((x² + y² − xy)^(0.75)) + z
     */
    public static void main(String[] args) {
        double x = -1;
        double y = -1;
        double z = -1;
        Scanner scannerDoub = new Scanner(System.in);
        System.out.println(f(x, y, z, scannerDoub));
    }

    public static double returnValor(int min, int max, double valor, Scanner scanner) {
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

    public static double f(double x, double y, double z, Scanner scanner) {
        x = returnValor(0, 2, x, scanner);
        y = returnValor(0, 2, y, scanner);
        z = returnValor(0, 2, z, scanner);
        return (4.0/3.0) * Math.pow((Math.pow(x, 2) + Math.pow(y, 2) - (x * y)), 0.75) + z; // 4/3((x² + y² − xy)^(0.75)) + z
    }
}
