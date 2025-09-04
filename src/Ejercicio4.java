import java.util.Scanner;

public class Ejercicio4 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 4: Condicional múltiple ===");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la calificación (0-5): ");
        double calificacion = scanner.nextDouble();

        if (calificacion >= 0 && calificacion <= 2) {
            System.out.println("Reprobado");
        } else if (calificacion == 3) {
            System.out.println("Aprobado con lo mínimo");
        } else if (calificacion >= 4 && calificacion <= 5) {
            System.out.println("Excelente");
        } else {
            System.out.println("Calificación inválida");
        }

    }
}