import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 12)
            System.out.println("Primera docena");
        else if (n >= 13 && n <= 24)
            System.out.println("Segunda docena");
        else if (n >= 25 && n <= 36)
            System.out.println("Tercera docena");
        else
            System.out.println("Número fuera de rango");
    }
}