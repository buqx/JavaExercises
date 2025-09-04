import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 2: Operaciones matemáticas ===");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / (double)num2));
        System.out.println("Módulo: " + (num1 % num2));


    }
}