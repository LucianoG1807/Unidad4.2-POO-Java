public class Main {
    public static void main(String[] args) {
        CajaRegistradora caja = new CajaRegistradora();

        caja.agregarComprobante(new FacturaA());
        caja.agregarComprobante(new FacturaB());
        caja.agregarComprobante(new NotaCredito());

        caja.emitirTodos(100000);
    }
}