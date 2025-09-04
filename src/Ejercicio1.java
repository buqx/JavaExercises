public class Ejercicio1 {
    // Atributos de la clase
    int num1;
    double num2;
    boolean bool;
    String str;

    // Constructor
    public Ejercicio1() {
        num1 = 5;
        num2 = 4.5;
        bool = true;
        str = "Estructura de datos, si sabe!";

        System.out.println("Entero: " + num1);
        System.out.println("Double: " + num2);
        System.out.println("Booleano: " + bool);
        System.out.println("Cadena: " + str);
    }

    // Método main OBLIGATORIO para ejecutar
    public static void main(String[] args) {
        // Crear instancia para que se ejecute el constructor
        new Ejercicio1();
    }
}