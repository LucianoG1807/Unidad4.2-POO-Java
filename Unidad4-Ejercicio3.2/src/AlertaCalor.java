public class AlertaCalor extends AlertaClimatica {
    @Override
    public void emitirAdvertencia(double magnitudMedida) {
        System.out.println("Temperatura: " +
                (magnitudMedida >= 40 ? "ALERTA POR CALOR EXTREMO" : "Temperatura normal"));
    }
}