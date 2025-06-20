public class Ejercicio22a {
    public static void main(String[] args) {
        int empleadosGenerados = 0;

        while (empleadosGenerados < 10) {
            // Generar categoría al azar
            char[] categorias = {'A', 'B', 'C'};
            char categoria = categorias[(int)(Math.random() * categorias.length)];

            // Generar antigüedad entre 0 y 20
            int antiguedad = (int)(Math.random() * 21);

            // Generar sueldo entre 30.000 y 80.000
            double sueldo = 30000 + Math.random() * 50000;

            // Validar datos antes de procesar
            if ((categoria == 'A' || categoria == 'B' || categoria == 'C') &&
                antiguedad >= 1 && antiguedad <= 30 &&
                sueldo >= 30000 && sueldo <= 80000) {

                // Determinar aumento por antigüedad
                double aumento = 0;
                if (antiguedad >= 1 && antiguedad <= 5) {
                    aumento = 0.05;
                } else if (antiguedad >= 6 && antiguedad <= 10) {
                    aumento = 0.10;
                } else {
                    aumento = 0.30;
                }

                // Determinar plus por categoría
                int plus = switch (categoria) {
                    case 'A' -> 1000;
                    case 'B' -> 2000;
                    case 'C' -> 3000;
                    default -> 0;
                };

                // Calcular sueldo neto
                double sueldoNeto = sueldo + (sueldo * aumento) + plus;

                // Mostrar resultados
                System.out.printf("Empleado %d: Categoria=%c | Antigüedad=%d | Sueldo bruto=%.2f | Sueldo neto=%.2f%n",
                        empleadosGenerados + 1, categoria, antiguedad, sueldo, sueldoNeto);

                empleadosGenerados++;
            }
        }
    }
}
