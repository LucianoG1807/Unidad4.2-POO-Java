public class SensorPresion extends SensorIndustrial {
    private double señalElectrica;

    public SensorPresion(String idSensor, boolean estadoOperativo, double señalElectrica) {
        super(idSensor, estadoOperativo);
        this.señalElectrica = señalElectrica;
    }

    @Override
    public String leerMetrica() {
        if (!estadoOperativo) {
            return "Sensor " + idSensor + " fuera de servicio.";
        }

        double presion = señalElectrica * 5;
        return "Sensor " + idSensor + ": " + presion + " bar";
    }
}