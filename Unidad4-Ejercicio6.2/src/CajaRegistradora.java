import java.util.ArrayList;
import java.util.List;

public class CajaRegistradora {
    private List<ComprobanteFiscal> comprobantes = new ArrayList<>();

    public void agregarComprobante(ComprobanteFiscal comprobante) {
        comprobantes.add(comprobante);
    }

    public void emitirTodos(double montoNeto) {
        for (ComprobanteFiscal comprobante : comprobantes) {
            comprobante.emitirComprobante(montoNeto);
            System.out.println("--------------------");
        }
    }
}