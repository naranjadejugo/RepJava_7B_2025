import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int curso = sc.nextInt();
        if (curso == 0)
            System.out.println("jardín de infantes");
        else if (curso >= 1 && curso <= 6)
            System.out.println("primaria");
        else if (curso >= 7 && curso <= 12)
            System.out.println("secundaria");
    }
}