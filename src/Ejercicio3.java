import java.util.Scanner;

public class Ejercicio3 {

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Oe, ingrese la edad");
        int edad = sc.nextInt();
        if (edad >= 18 && edad <= 25) {
            System.out.println("Eres mayor de edad, te estas haciendo viejo");
        } else if (edad > 25) {
            System.out.println("Que vejestorio, dios!");
        } else{
            System.out.println("Eres menor de edad, chiquillo");
        }

    }

}
