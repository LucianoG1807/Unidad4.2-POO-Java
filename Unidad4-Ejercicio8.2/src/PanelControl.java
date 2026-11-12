import java.util.ArrayList;
import java.util.List;

public class PanelControl {
    private List<SensorIndustrial> sensores = new ArrayList<>();

    public void agregarSensor(SensorIndustrial sensor) {
        sensores.add(sensor);
    }

    public void realizarLecturas() {
        for (SensorIndustrial sensor : sensores) {
            System.out.println(sensor.leerMetrica());
        }
    }
}