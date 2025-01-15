import java.util.Map;

public class ConvertirMoneda {
    private final Map<String, Double> conversion_rates;

    public ConvertirMoneda(Moneda moneda) {
        this.conversion_rates = moneda.conversion_rates();
    }

    public double convierte(String origen, String destino, double cantidad) {
        // Verificar que ambas monedas existan
        if (!conversion_rates.containsKey(origen) || !conversion_rates.containsKey(destino)) {
            throw new IllegalArgumentException(
                    "Moneda no soportada o no encontrada en las tasas de conversión."
            );
        }
        double tasaDeOrigen = conversion_rates.get(origen);
        double tasaDeDestino   = conversion_rates.get(destino);

        // Implemento de formula general
        double camtidadEnDolares = cantidad / tasaDeOrigen;
        return camtidadEnDolares * tasaDeDestino;
    }

}
