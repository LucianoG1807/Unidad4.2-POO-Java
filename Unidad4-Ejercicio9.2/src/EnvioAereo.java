public class EnvioAereo extends MetodoEnvio {
    public EnvioAereo(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularTarifa(double pesoKg, double distanciaKm) {
        return tarifaBase + (pesoKg * 300) + (distanciaKm * 10);
    }
}