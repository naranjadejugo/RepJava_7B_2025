import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la categoría (a/b/c): ");
        char cat = sc.next().toLowerCase().charAt(0);
        if (cat == 'a') System.out.println("hijo");
        else if (cat == 'b') System.out.println("padres");
        else if (cat == 'c') System.out.println("abuelos");
    }
}