import java.util.Scanner;
import java.util.function.Function;

public class ReglaTrapecio {

    // Método para calcular la aproximación de la integral usando la regla del trapecio
    public static double reglaTrapecio(Function<Double, Double> funcion, double a, double b, int n) {
        // Calculamos el ancho de cada subintervalo
        double h = (b - a) / n;
        // Sumamos el valor de la función en los extremos de los intervalos
        double suma = 0.5 * (funcion.apply(a) + funcion.apply(b));
        // Sumamos el valor de la función en los puntos interiores de los intervalos
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            suma += funcion.apply(x);
        }
        // Multiplicamos por el ancho de los intervalos y devolvemos el resultado
        return h * suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese los límites de integración
        System.out.print("Ingrese el límite inferior de integración: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el límite superior de integración: ");
        double b = scanner.nextDouble();

        // Solicitamos al usuario que ingrese el número de subintervalos
        System.out.print("Ingrese el número de subintervalos (mayor número, mayor precisión): ");
        int n = scanner.nextInt();

        // Definimos la función f(x) = e^(x^2)
        Function<Double, Double> funcion = x -> Math.exp(x * x);

        // Calculamos la aproximación de la integral usando la regla del trapecio
        double resultado = reglaTrapecio(funcion, a, b, n);

        // Tomamos el valor absoluto del resultado para asegurarnos de que sea positivo
        double resultadoPositivo = Math.abs(resultado);

        // Imprimimos el resultado
        System.out.println("Aproximación de la integral de e^(x^2) usando la regla del trapecio: " + resultadoPositivo);

        scanner.close();
    }
}
