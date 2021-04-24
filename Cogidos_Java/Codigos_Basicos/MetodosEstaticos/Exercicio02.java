package FaculPOO.Abril.MetodosEstaticos;

public class Exercicio02 {
    /* Crie um método estático que calcule a potência de um número. O método deverá receber
     * por parâmetro o número e a potência desejada e retornar o resultado.
     * Não deve ser utilizado o método Math.pow ou algo similar.
     */
    public static void main(String[] args) {
        System.out.println(calcPotencia(5, 7));
    }

    public static double calcPotencia(double numero, int potencia) {
        double resultado = numero;
        int cont = 1;
        while(cont < potencia) {
            resultado *= numero;
            cont ++;
        }
        return resultado;
    }
}
