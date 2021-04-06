package FaculPOO.Março.ClasseMath;

public class Exercicio01 {
    /* Desenvolva um programa em java que calcule a função 1. Onde x = 15.5:
     * f = ³√x + log(ex) − min(tg(x2), tanh(x3))
     */
    public static void main(String[] args) {
        double x = 15.5;
        double f;
        f = Math.cbrt(x) + Math.log(x);
        f -= Math.min(Math.tan(Math.pow(x, 2)), Math.tanh(Math.pow(x, 3)));
        System.out.println(f);
    }
}
