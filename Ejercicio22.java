public class Ejercicio22 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            char[] categorias = {'A', 'B', 'C'};
            char cat = categorias[(int)(Math.random() * 3)];
            int ant = 1 + (int)(Math.random() * 20);
            double sueldo = 30000 + Math.random() * 20000;

            double aumento = (ant <= 5) ? 0.05 : (ant <= 10 ? 0.10 : 0.30);
            int plus = (cat == 'A') ? 1000 : (cat == 'B' ? 2000 : 3000);
            double neto = sueldo + (sueldo * aumento) + plus;

            System.out.printf("Empleado %d: Cat=%c, Ant=%d, Bruto=%.2f, Neto=%.2f%n",
                              count + 1, cat, ant, sueldo, neto);
            count++;
        }
    }
}