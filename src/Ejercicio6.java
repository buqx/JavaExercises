import java.util.Scanner;

public class Ejercuicio6 {
    int numero;
    int factorial = 1;
    int i = 1;
    public Ejercuicio6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero (entero) para calcular su factorial:");
        numero = sc.nextInt();
         while (i <= numero) {
            factorial = factorial * i;
            if( i == numero) {
                System.out.println(i);
            } else {
                System.out.print(i + " x " );
            }
            i++;

         }
        System.out.println("El factorial de " + numero + " es: " + factorial);
        sc.close();
    }

    public static void main(String[] args) {
        new Ejercuicio6();
    }
}
