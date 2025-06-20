public class Ejercicio18 {
    public static void main(String[] args) {
        for (int t = 1; t <= 10; t++) {
            System.out.println("Tabla del " + t);
            for (int i = 1; i <= 10; i++) {
                System.out.println(t + " x " + i + " = " + (t * i));
            }
            System.out.println();
        }
    }
}