public class Ejercicio19 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            int n = (int)(Math.random() * 100);
            System.out.println("Número: " + n);
            suma += n;
        }
        System.out.println("Suma: " + suma + ", Promedio: " + (suma / 10.0));
    }
}