import java.util.Scanner;

public class Calculadora {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 11: Calculadora ===");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Suma: " + sumar(num1, num2));
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Multiplicación: " + multiplicar(num1, num2));

        double division = dividir(num1, num2);
        if (division != Double.MIN_VALUE) {
            System.out.println("División: " + division);
        }

    }

    // Los métodos de operación también deben ser static
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero");
            return Double.MIN_VALUE;
        }
        return a / b;
    }
}