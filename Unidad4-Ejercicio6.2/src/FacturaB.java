public class FacturaB implements ComprobanteFiscal {
    @Override
    public void emitirComprobante(double montoNeto) {
        double iva = montoNeto * 0.21;
        double total = montoNeto + iva;

        System.out.println("FACTURA B");
        System.out.println("Neto: $" + montoNeto);
        System.out.println("IVA incluido: $" + iva);
        System.out.println("Total: $" + total);
    }
}