import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        switch (p) {
            case 1: System.out.println("Medalla de oro"); break;
            case 2: System.out.println("Medalla de plata"); break;
            case 3: System.out.println("Medalla de bronce"); break;
            default: System.out.println("Siga participando");
        }
    }
}