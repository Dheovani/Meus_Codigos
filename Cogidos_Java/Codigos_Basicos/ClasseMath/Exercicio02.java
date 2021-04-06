package FaculPOO.Março.ClasseMath;

public class Exercicio02 {
    /* Desenvolva um programa em java que calcule a função 2:
     * f =|√1| + |√2| + |√3| + ... + |√1998|
     */
    public static void main(String[] args) {
        double f = 0;
        for(int i = 1; i <= 1998; i ++) {
            f += Math.abs(i);
        }
        System.out.println(f);
    }
}
