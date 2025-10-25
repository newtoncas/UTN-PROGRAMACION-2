package tp8.Parte1;
public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private String titular;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = "Titular de la Tarjeta";
    }

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + String.format("%.2f", monto) + 
                          " con tarjeta terminada en " + 
                          numeroTarjeta.substring(numeroTarjeta.length() - 4));
        System.out.println("Titular: " + titular);
        System.out.println("✅ Pago con tarjeta procesado exitosamente");
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("🎉 Aplicando descuento del " + porcentaje + "% en pago con tarjeta de crédito");
    }

    @Override
    public double calcularTotalConDescuento(double monto, double porcentaje) {
        double descuento = monto * (porcentaje / 100);
        double totalConDescuento = monto - descuento;
        System.out.println("Descuento aplicado: $" + String.format("%.2f", descuento));
        System.out.println("Total con descuento: $" + String.format("%.2f", totalConDescuento));
        return totalConDescuento;
    }

    // Getters
    public String getNumeroTarjeta() { return numeroTarjeta; }
    public String getTitular() { return titular; }
}
