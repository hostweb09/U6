import java.util.Scanner;
import java.util.Scanner;
public class LagrangeInterpolation {

    // Método para calcular el polinomio de Lagrange
    public static double lagrangeInterpolation(double[] x, double[] y, double xi) {
        int n = x.length;
        double result = 0.0;

        for (int i = 0; i < n; i++) {
            double term = y[i];
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    term = term * (xi - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de puntos: ");
        int n = scanner.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];

        System.out.println("Introduce los valores de x:");
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextDouble();
        }

        System.out.println("Introduce los valores de y:");
        for (int i = 0; i < n; i++) {
            y[i] = scanner.nextDouble();
        }

        System.out.print("Introduce el valor de xi para el cual quieres interpolar: ");
        double xi = scanner.nextDouble();

        double yi = lagrangeInterpolation(x, y, xi);
        System.out.println("El valor interpolado en xi = " + xi + " es yi = " + yi);

        scanner.close();
    }
}