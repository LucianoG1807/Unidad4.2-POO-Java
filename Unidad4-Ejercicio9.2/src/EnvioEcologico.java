public class EnvioEcologico extends MetodoEnvio {
    public EnvioEcologico(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularTarifa(double pesoKg, double distanciaKm) {
        return tarifaBase + (pesoKg * 80) + (distanciaKm * 3);
    }
}