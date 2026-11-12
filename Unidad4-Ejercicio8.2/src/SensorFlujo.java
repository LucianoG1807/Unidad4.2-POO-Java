public class SensorFlujo extends SensorIndustrial {
    private double señalElectrica;

    public SensorFlujo(String idSensor, boolean estadoOperativo, double señalElectrica) {
        super(idSensor, estadoOperativo);
        this.señalElectrica = señalElectrica;
    }

    @Override
    public String leerMetrica() {
        if (!estadoOperativo) {
            return "Sensor " + idSensor + " fuera de servicio.";
        }

        double flujo = señalElectrica * 20;
        return "Sensor " + idSensor + ": " + flujo + " litros/minuto";
    }
}