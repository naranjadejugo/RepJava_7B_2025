import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mes = sc.nextLine().toLowerCase();
        switch (mes) {
            case "abril": case "junio": case "septiembre": case "noviembre":
                System.out.println("30 días"); break;
            case "febrero":
                System.out.println("28 días"); break;
            default:
                System.out.println("31 días");
        }
    }
}