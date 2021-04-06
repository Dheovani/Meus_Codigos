package FaculPOO.Março.ClasseMath;

public class Exercicio04 {
    /* Desenvolva um programa em java que calcule a fun¸c˜ao 4:
     * f = somatório((n = 2, 10)somatório(j = 1000, 10010)|(n)√j|)
     */
    public static void main(String[] args) {
        double f = 0;
        for(int i = 2; i <= 10; i ++) {
            for(int j = 1000; j < 10010; j ++) {
                f += Math.abs(Math.sqrt(j));
            }
        }
        System.out.println(f);
    }
}
