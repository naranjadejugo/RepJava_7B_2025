import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt(), p2 = sc.nextInt();
        if ((p1 == 0 && p2 == 2) || (p1 == 1 && p2 == 0) || (p1 == 2 && p2 == 1))
            System.out.println("Jugador 1 gana");
        else if (p1 == p2)
            System.out.println("Empate");
        else
            System.out.println("Jugador 2 gana");
    }
}