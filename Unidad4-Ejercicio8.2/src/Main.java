public class Main {
    public static void main(String[] args) {
        PanelControl panel = new PanelControl();

        panel.agregarSensor(new SensorTemperatura("T01", true, 2.5));
        panel.agregarSensor(new SensorPresion("P01", true, 4.2));
        panel.agregarSensor(new SensorFlujo("F01", true, 3.5));

        panel.realizarLecturas();
    }
}