public class Ejercicio5 {
    int i;
     public Ejercicio5() {
            for(i = 1; i <= 50; i++){
                if(i % 2 == 0){
                    System.out.println(i + " es par");
                }
            }
     }
    public static void main(String[] args) {
        new Ejercicio5();
    }
}
