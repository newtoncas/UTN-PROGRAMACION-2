package tp8.Parte1;

public interface PagoConDescuento extends Pago {
    void aplicarDescuento(double porcentaje);
    double calcularTotalConDescuento(double monto, double porcentaje);
}