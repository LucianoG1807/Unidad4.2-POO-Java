public abstract class SensorIndustrial {
    protected String idSensor;
    protected boolean estadoOperativo;

    public SensorIndustrial(String idSensor, boolean estadoOperativo) {
        this.idSensor = idSensor;
        this.estadoOperativo = estadoOperativo;
    }

    public abstract String leerMetrica();
}