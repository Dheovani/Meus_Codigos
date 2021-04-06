package FaculPOO.Março.ClasseMath;

public class Exercicio06 {
    /* Desenvolva um programa em java que calcule a função 6. Onde r ú um número aleatório ∈ [0, 1].
     * f = somatório((i = 1, 1)nrand * i)
     */
    public static void main(String[] args) {
        double r = Math.random();
        double i = 1;
        double nrand;
        if (r > 0.5) {
            nrand = -i;
        } else {
            nrand = i;
        }
        double f = nrand * i;
    }
}
