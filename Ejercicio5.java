import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el puesto: ");
        int p = sc.nextInt();
        if (p == 1) System.out.println("Medalla de oro");
        else if (p == 2) System.out.println("Medalla de plata");
        else if (p == 3) System.out.println("Medalla de bronce");
        else System.out.println("Siga participando");
    }
}