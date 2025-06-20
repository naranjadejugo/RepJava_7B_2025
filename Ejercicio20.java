public class Ejercicio20 {
    public static void main(String[] args) {
        int i = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        do {
            int n = (int)(Math.random() * 100);
            System.out.println("Número: " + n);
            if (n > max) max = n;
            if (n < min) min = n;
            i++;
        } while (i < 10);
        System.out.println("Máximo: " + max + ", Mínimo: " + min);
    }
}