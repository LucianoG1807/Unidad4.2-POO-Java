public class SistemaMonitoreo {
    public void activarAlerta(AlertaClimatica alerta, double magnitud) {
        alerta.emitirAdvertencia(magnitud);
    }
}