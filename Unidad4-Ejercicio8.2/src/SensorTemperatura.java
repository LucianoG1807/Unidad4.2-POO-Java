public class SensorTemperatura extends SensorIndustrial {
    private double señalElectrica;

    public SensorTemperatura(String idSensor, boolean estadoOperativo, double señalElectrica) {
        super(idSensor, estadoOperativo);
        this.señalElectrica = señalElectrica;
    }

    @Override
    public String leerMetrica() {
        if (!estadoOperativo) {
            return "Sensor " + idSensor + " fuera de servicio.";
        }

        double temperatura = señalElectrica * 10;
        return "Sensor " + idSensor + ": " + temperatura + " °C";
    }
}