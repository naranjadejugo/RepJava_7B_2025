import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cat = sc.next().toUpperCase().charAt(0);
        int ant = sc.nextInt();
        double sueldo = sc.nextDouble();

        double aumento = (ant <= 5) ? 0.05 : (ant <= 10 ? 0.10 : 0.30);
        int plus = (cat == 'A') ? 1000 : (cat == 'B' ? 2000 : 3000);

        double neto = sueldo + (sueldo * aumento) + plus;
        System.out.println("Sueldo neto: " + neto);
    }
}