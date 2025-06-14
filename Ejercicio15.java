import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char clase = sc.next().toLowerCase().charAt(0);
        switch (clase) {
            case 'a': System.out.println("4 ruedas, 1 motor"); break;
            case 'b': System.out.println("4 ruedas, 1 motor, cierre, aire"); break;
            case 'c': System.out.println("4 ruedas, 1 motor, cierre, aire, airbag"); break;
        }
    }
}