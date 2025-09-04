import java.util.Scanner;

public class Ejercicio3 {
    int edad;

    public Ejercicio3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Oe, ingrese la edad");
        edad = sc.nextInt();
        if (edad >= 18 && edad <= 25) {
            System.out.println("Eres mayor de edad, te estas haciendo viejo");
        } else if (edad > 25) {
            System.out.println("Que vejestorio, dios!");
        } else{
            System.out.println("Eres menor de edad, chiquillo");
        }
    }

    public static void main(String[] args) {
        new Ejercicio3();
    }
}
