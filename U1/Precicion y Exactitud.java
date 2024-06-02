import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el valor verdadero
        System.out.print("Ingrese el valor verdadero: ");
        double valorVerdadero = scanner.nextDouble();

        // Pedir al usuario que ingrese cuántos valores desea comparar
        System.out.print("¿Cuántos valores desea ingresar para comparar? ");
        int cantidadValores = scanner.nextInt();

        // Pedir al usuario que ingrese el margen de error
        System.out.print("Ingrese el margen de error: ");
        double margenError = scanner.nextDouble();

        // Inicializar variables para el conteo de valores exactos y precisos
        int exactos = 0;
        int precisos = 0;

        // Pedir al usuario que ingrese los valores para comparar
        for (int i = 1; i <= cantidadValores; i++) {
            System.out.print("Ingrese el valor #" + i + ": ");
            double valor = scanner.nextDouble();

            // Verificar si el valor es exacto o preciso
            if (valor >= valorVerdadero - margenError && valor <= valorVerdadero + margenError) {
                precisos++;
                if (valor == valorVerdadero) {
                    exactos++;
                }
            }
        }

        // Mostrar resultados
        System.out.println("Exactos: " + exactos);
        System.out.println("Precisos: " + precisos);

        scanner.close();
    }
}
