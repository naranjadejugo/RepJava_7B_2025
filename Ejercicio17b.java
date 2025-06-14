public class Ejercicio17b {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 2; i <= 100; i += 2)
            suma += i;
        System.out.println("Suma pares sin if: " + suma);
    }
}