import java.util.Scanner;

public class Ejercicio2 {
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    double modulo;

    public Ejercicio2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primero numero (entero)");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero (entero)");
        num2 = sc.nextInt();

        if(num1 < num2){
            System.out.println("El primer numero debe ser mayor o igual al segundo numero");
            return;
        }else {
            System.out.println("La suma de " + num1 + " + " + num2 + " es: " + (num1 + num2));
            System.out.println("La resta de " + num1 + " - " + num2 + " es: " + (num1 - num2));
            System.out.println("La multiplicacion de " + num1 + " * " + num2 + " es: " + (num1 * num2));
            System.out.println("La division de " + num1 + " / " + num2 + " es: " + (num1 / num2));
            System.out.println("El modulo de " + num1 + " % " + num2 + " es: " + (num1 % num2));
        }
        sc.close();
    }

    public static void main(String[] args) {
        new Ejercicio2();
    }
}
