public class AlertaTormenta extends AlertaClimatica {
    @Override
    public void emitirAdvertencia(double magnitudMedida) {
        System.out.println("Tormenta eléctrica: " +
                (magnitudMedida >= 80 ? "RIESGO ALTO" : "Riesgo moderado"));
    }
}