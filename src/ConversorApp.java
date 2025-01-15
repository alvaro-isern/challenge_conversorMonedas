import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConsultarMoneda consultarMoneda = new ConsultarMoneda();
        ConvertirMoneda convertir;

        boolean salir = false;
        while (!salir) {
            System.out.print("""
                    \n============== CONVERSOR DE MONEDAS =================
                    1) Convertir dolares (USD) a euros (EUR)
                    2) Convertir dolares (USD) a pesos mexicanos (MXN)
                    3) Convertir euros (EUR) a libras esterlinas (GBP)
                    4) Convertir soles (PEN) a reales brasileros (BRL)
                    5) Convertir entre dos monedas cualesquiera (manual)
                    6) Salir
                    =======================================================
                    """);
            System.out.print("Elige una opción: ");

            try {
                double cantidadOrigen;
                double cantidadDestino;
                int opcion = Integer.parseInt(sc.nextLine());
                String codigoBase;
                Moneda moneda;

                switch (opcion) {
                    case 1:
                        codigoBase = "USD";
                        moneda = consultarMoneda.obtenieneTipoDeCambio(codigoBase);
                        convertir = new ConvertirMoneda(moneda);
                        System.out.print("Ingresa la cantidad en USD (dolares): ");
                        cantidadOrigen = Double.parseDouble(sc.nextLine());
                        cantidadDestino = convertir.convierte("USD", "EUR", cantidadOrigen);
                        System.out.println("* " + cantidadOrigen + " USD  equivalen a " + cantidadDestino + " EUR *");
                        break;

                    case 2:
                        codigoBase = "USD";
                        moneda = consultarMoneda.obtenieneTipoDeCambio(codigoBase);
                        convertir = new ConvertirMoneda(moneda);
                        System.out.print("Ingresa la cantidad en USD (dolares): ");
                        cantidadOrigen = Double.parseDouble(sc.nextLine());
                        cantidadDestino = convertir.convierte("USD", "MXN", cantidadOrigen);
                        System.out.println("* " + cantidadOrigen + " USD equivalen a " + cantidadDestino + " MXN *");
                        break;

                    case 3:
                        codigoBase = "EUR";
                        moneda = consultarMoneda.obtenieneTipoDeCambio(codigoBase);
                        convertir = new ConvertirMoneda(moneda);
                        System.out.print("Ingresa la cantidad en EUR (euros): ");
                        cantidadOrigen = Double.parseDouble(sc.nextLine());
                        cantidadDestino = convertir.convierte("EUR", "GBP", cantidadOrigen);
                        System.out.println("* " + cantidadOrigen + " EUR equivalen a " + cantidadDestino + " GBP *");
                        break;

                    case 4:
                        codigoBase = "PEN";
                        moneda = consultarMoneda.obtenieneTipoDeCambio(codigoBase);
                        convertir = new ConvertirMoneda(moneda);
                        System.out.print("Ingresa la cantidad en PEN (soles): ");
                        cantidadOrigen = Double.parseDouble(sc.nextLine());
                        cantidadDestino = convertir.convierte("PEN", "BRL", cantidadOrigen);
                        System.out.println("* " + cantidadOrigen + " PEN equivalen a " + cantidadDestino + " BRL *");
                        break;

                    case 5:
                        System.out.print("Ingresa la moneda de origen (ej. USD): ");
                        String from = sc.nextLine().toUpperCase().trim();
                        moneda = consultarMoneda.obtenieneTipoDeCambio(from);
                        convertir = new ConvertirMoneda(moneda);

                        System.out.print("Ingresa la moneda de destino (ej. MXN): ");
                        String to = sc.nextLine().toUpperCase().trim();

                        System.out.print("Ingresa la cantidadOrigen a convertir: ");
                        cantidadOrigen = Double.parseDouble(sc.nextLine());

                        cantidadDestino = convertir.convierte(from, to, cantidadOrigen);
                        System.out.println("* " + cantidadOrigen + " " + from + " equivalen a " + cantidadDestino + " " + to + " *");
                        break;

                    case 6:
                        salir = true;
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opción inválida. Intenta de nuevo.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Debes ingresar un número.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Error al obtener las tasas de conversión: " + e.getMessage());
                System.exit(1);
            }
        }
        sc.close();
    }
}
