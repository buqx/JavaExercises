import java.util.Scanner;

public class Ejercicio6 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 6: Bucle while (Factorial) ===");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser positivo");
        } else {
            long factorial = 1;
            int i = 1;

            while (i <= numero) {
                factorial *= i;
                i++;
            }

            System.out.println(numero + "! = " + factorial);
        }


    }
}