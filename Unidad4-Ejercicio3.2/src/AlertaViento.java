public class AlertaViento extends AlertaClimatica {
    @Override
    public void emitirAdvertencia(double magnitudMedida) {
        System.out.println("Viento Zonda: " +
                (magnitudMedida >= 70 ? "ALERTA ROJA" : "Alerta moderada"));
    }
}