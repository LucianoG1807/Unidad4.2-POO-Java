public class FacturaA implements ComprobanteFiscal {
    @Override
    public void emitirComprobante(double montoNeto) {
        double iva = montoNeto * 0.21;
        double total = montoNeto + iva;

        System.out.println("FACTURA A");
        System.out.println("Neto: $" + montoNeto);
        System.out.println("IVA 21%: $" + iva);
        System.out.println("Total: $" + total);
    }
}