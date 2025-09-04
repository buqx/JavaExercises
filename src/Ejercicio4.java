import java.util.Scanner;

public class Ejercicio4 {
    Double nota;

    public Ejercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota 'Entre 1 y 5':");
        nota = sc.nextDouble();
        if (nota > 0 && nota <= 2){
            System.out.println("Reprobado");
        } else if (nota >= 3 && nota <= 4.5){
            System.out.println("Aprobado");
        } else if (nota >= 4.5 && nota <= 5){
            System.out.println("Excelente");
        } else {
            System.out.println("Nota invalida");
        }
    }

    public static void main(String[] args) {
        new Ejercicio4();
    }
}
