import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConsultarMoneda consultarMoneda = new ConsultarMoneda();
        ConvertirMoneda convertir = null;

        // Obtenemos los datos de la API (dentro de un try/catch por si falla)
        try {
            Moneda moneda = consultarMoneda.obtenieneTipoDeCambio();
            convertir = new ConvertirMoneda(moneda);
        } catch (Exception e) {
            System.err.println("Error al obtener las tasas de conversión: " + e.getMessage());
            System.exit(1);
        }

        boolean salir = false;
        while(!salir) {
            System.out.print("""
                    \n============== CONVERSOR DE MONEDAS =================
                    1) Convertir dolares (USD) a euros (EUR)
                    2) Convertir dolares (USD) a pesos mexicanos (MXN)
                    3) Convertir euros (EUR) a libras esterlinas (GBP)
                    4) Convertir entre dos monedas cualesquiera (manual)
                    5) Salir
                    =======================================================
                    """);
            System.out.print("Elige una opción: ");

            int opcion;
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Debes ingresar un número.");
                continue;
            }

            double cantidadEnDolares;

            switch(opcion) {
                case 1:
                    System.out.print("Ingresa la cantidad en USD (dolares): ");
                    cantidadEnDolares = Double.parseDouble(sc.nextLine());
                    double resultadoEnEuros = convertir.convierte("USD", "EUR", cantidadEnDolares);
                    System.out.println("* " + cantidadEnDolares + " USD  equivalen a " + resultadoEnEuros + " EUR *");
                    break;

                case 2:
                    System.out.print("Ingresa la cantidad en USD (dolares): ");
                    cantidadEnDolares = Double.parseDouble(sc.nextLine());
                    double resultadoEnPesosMexicanos = convertir.convierte("USD", "MXN", cantidadEnDolares);
                    System.out.println("* " + cantidadEnDolares + " USD equivalen a " + resultadoEnPesosMexicanos + " MXN *");
                    break;

                case 3:
                    System.out.print("Ingresa la cantidad en EUR (euros): ");
                    double cantidadEnEuros = Double.parseDouble(sc.nextLine());
                    double resultadoEnLibrasEsterlinas = convertir.convierte("EUR", "GBP", cantidadEnEuros);
                    System.out.println("* " + cantidadEnEuros + " EUR equivalen a " + resultadoEnLibrasEsterlinas + " GBP +");
                    break;

                case 4:
                    System.out.print("Ingresa la moneda de origen (ej. USD): ");
                    String from = sc.nextLine().toUpperCase().trim();

                    System.out.print("Ingresa la moneda de destino (ej. MXN): ");
                    String to = sc.nextLine().toUpperCase().trim();

                    System.out.print("Ingresa la cantidad a convertir: ");
                    double cantidad = Double.parseDouble(sc.nextLine());

                    try {
                        double resultadoManual = convertir.convierte(from, to, cantidad);
                        System.out.println(cantidad + " " + from + " equivalen a " + resultadoManual + " " + to);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }

        sc.close();
    }
}
