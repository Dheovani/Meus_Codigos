package FaculPOO.Abril.MetodosEstaticos;

public class Exercicio03 {
    /* Crie um método estático que receba por parâmetro um vetor de números reais e que calcule
     * e retorne a soma dos elementos.
     */
    public static void main(String[] args) {
        double[] vetor = {1, 2.5, 7.95, 8.4, 12, 16, 94.8};
        System.out.println(somarNumeros(vetor));
    }

    public static double somarNumeros(double[] vetor) {
        double resultado = 0;
        for(double variavel : vetor) {
            resultado += variavel;
        }
        return resultado;
    }
}
