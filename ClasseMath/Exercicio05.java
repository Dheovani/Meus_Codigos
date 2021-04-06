package FaculPOO.Março.ClasseMath;

public class Exercicio05 {
    /* Desenvolva um programa em java que calcule a função 5:
     * f = somatório((1, 10)loge(n)*log10(n))
     */
    public static void main(String[] args) {
        double f = 1;
        for(int i = 1; i <= 10; i ++) {
            f += (Math.log(i) * Math.log10(i));
        }
        System.out.println(f);
    }
}
