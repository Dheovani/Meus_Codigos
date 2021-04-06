package FaculPOO.Março.ClasseMath;

public class Exercicio03 {
    /*Desenvolva um programa em java que calcule a função 3:
     * f = somatório((n = 0, 100)max(sin(n), cos(n)))
     */
    public static void main(String[] args) {
        double f = 0;
        for(int i = 0; i <= 100; i ++) {
            f += i;
        }
        System.out.println(f);
    }
}
