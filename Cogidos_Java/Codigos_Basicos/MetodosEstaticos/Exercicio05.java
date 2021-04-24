package FaculPOO.Abril.MetodosEstaticos;

public class Exercicio05 {
    /* Crie um método estático que receba por parâmetro uma quantidade infinita de parâmetros
     * de números reais e que calcule e retorne o desvio padrão. Confira a fórmula do desvio
     * padrão em https://www.todamateria.com.br/desviopadrao/
     */
    public static void main(String[] args) {
        System.out.println(desvioPadrao(8, 5, 9, 6, 7));
        System.out.println(desvioPadrao(55, 80, 64, 69, 75, 70, 68, 90, 78, 84));
    }

    public static double desvioPadrao(int... i) {
        double mediaArit = 0;
        for(double valor : i) {
            mediaArit += valor;
        }
        mediaArit = mediaArit/i.length;
        double total = 0;
        for(int j = 1; j <= i.length; j ++) {
            total += (i[j - 1] - mediaArit) * (i[j - 1] - mediaArit);
        }
        total = total/i.length;
        return Math.sqrt(total);
    }
}
