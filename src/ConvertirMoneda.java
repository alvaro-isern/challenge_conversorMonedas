import java.util.Map;

public class ConvertirMoneda {
    private final Map<String, Double> conversion_rates;

    public ConvertirMoneda(Moneda moneda) {
        this.conversion_rates = moneda.conversion_rates();
    }

    public double convierte(String from, String to, double cantidad) {
        // Verificar que ambas monedas existan
        if (!conversion_rates.containsKey(from) || !conversion_rates.containsKey(to)) {
            throw new IllegalArgumentException(
                    "Moneda no soportada o no encontrada en las tasas de conversión."
            );
        }
        double rateFrom = conversion_rates.get(from);  // Tasa de 'from'
        double rateTo   = conversion_rates.get(to);    // Tasa de 'to'

        // Implemento de formula general
        double camtidadEnDolares = cantidad / rateFrom;
        return camtidadEnDolares * rateTo;
    }

}
