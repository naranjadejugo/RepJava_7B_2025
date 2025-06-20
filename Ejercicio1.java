import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese las tres notas: ");
        double n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble();
        double promedio = (n1 + n2 + n3) / 3;
        if (promedio >= 7)
            System.out.println("Aprobado");
        else
            System.out.println("Reprobado");
    }
}