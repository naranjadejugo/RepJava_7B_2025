import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int mayor = (a > b && a > c) ? a : (b > c ? b : c);
        System.out.println("Mayor: " + mayor);
    }
}