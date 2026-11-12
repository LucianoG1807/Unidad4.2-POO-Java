public class NotaCredito implements ComprobanteFiscal {
    @Override
    public void emitirComprobante(double montoNeto) {
        double iva = montoNeto * 0.21;
        double total = montoNeto + iva;

        System.out.println("NOTA DE CRÉDITO");
        System.out.println("Neto a acreditar: $" + montoNeto);
        System.out.println("IVA: $" + iva);
        System.out.println("Total a acreditar: $" + total);
    }
}