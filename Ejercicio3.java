import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el mes: ");
        String mes = sc.nextLine().toLowerCase();
        if (mes.equals("febrero"))
            System.out.println("28 días");
        else if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre"))
            System.out.println("30 días");
        else
            System.out.println("31 días");
    }
}