import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Variables y tipos de datos");
            System.out.println("2. Operaciones matemáticas");
            System.out.println("3. Condicional simple (Mayor de edad)");
            System.out.println("4. Condicional múltiple (Calificaciones)");
            System.out.println("5. Bucle for (Números pares)");
            System.out.println("6. Bucle while (Factorial)");
            System.out.println("7. Clase Persona básica");
            System.out.println("8. Método saludar()");
            System.out.println("9. Constructor Persona");
            System.out.println("10. Arreglo de Personas");
            System.out.println("11. Calculadora");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    Ejercicio1.ejecutar();
                    break;
                case 2:
                    Ejercicio2.ejecutar();
                    break;
                case 3:
                    Ejercicio3.ejecutar();
                    break;
                case 4:
                    Ejercicio4.ejecutar();
                    break;
                case 5:
                    Ejercicio5.ejecutar();
                    break;
                case 6:
                    Ejercicio6.ejecutar();
                    break;
                case 7:
                    ejecutarEjercicio7(scanner);
                    break;
                case 8:
                    ejecutarEjercicio8(scanner);
                    break;
                case 9:
                    ejecutarEjercicio9(scanner);
                    break;
                case 10:
                    ejecutarEjercicio10(scanner);
                    break;
                case 11:
                    Calculadora.ejecutar();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
            }

            if (opcion != 0) {
                System.out.println("\nPresiona Enter para continuar...");
                scanner.nextLine();
            }

        } while (opcion != 0);

        scanner.close();
    }

    // Métodos para los ejercicios de Persona que piden datos por consola
    private static void ejecutarEjercicio7(Scanner scanner) {
        System.out.println("\n=== EJERCICIO 7: Clase básica ===");
        System.out.print("Ingresa el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Persona p1 = new Persona(nombre, edad);
        p1.mostrarDatos();
    }

    private static void ejecutarEjercicio8(Scanner scanner) {
        System.out.println("\n=== EJERCICIO 8: Método saludar ===");
        System.out.print("Ingresa el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Persona p2 = new Persona(nombre, edad);
        System.out.println(p2.saludar());
    }

    private static void ejecutarEjercicio9(Scanner scanner) {
        System.out.println("\n=== EJERCICIO 9: Constructor ===");

        System.out.println("-- Primera persona --");
        System.out.print("Ingresa el nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingresa la edad: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.println("-- Segunda persona --");
        System.out.print("Ingresa el nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingresa la edad: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Persona p3 = new Persona(nombre1, edad1);
        Persona p4 = new Persona(nombre2, edad2);

        System.out.println("\nPersona 1: " + p3.getNombre() + ", " + p3.getEdad() + " años");
        System.out.println("Persona 2: " + p4.getNombre() + ", " + p4.getEdad() + " años");
    }

    private static void ejecutarEjercicio10(Scanner scanner) {
        System.out.println("\n=== EJERCICIO 10: Arreglo de Personas ===");
        Persona[] personas = new Persona[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\n-- Persona " + (i + 1) + " --");
            System.out.print("Ingresa el nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingresa la edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            personas[i] = new Persona(nombre, edad);
        }

        System.out.println("\nNombres en el arreglo:");
        for (int i = 0; i < personas.length; i++) {
            System.out.println((i + 1) + ". " + personas[i].getNombre() + " (" + personas[i].getEdad() + " años)");
        }
    }
}