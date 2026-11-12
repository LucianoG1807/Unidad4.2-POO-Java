import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VehiculoCarrera> vehiculos = new ArrayList<>();

        vehiculos.add(new MonoplazaF1(50));
        vehiculos.add(new AutoRally(50));
        vehiculos.add(new Motocicleta(50));

        for (VehiculoCarrera vehiculo : vehiculos) {
            vehiculo.acelerar(5);
            vehiculo.obtenerDesempeno();
        }
    }
}