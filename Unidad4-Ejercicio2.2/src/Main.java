import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BoletaElectoral> boletas = new ArrayList<>();

        boletas.add(new BoletaIntendente("Juan Perez", "Partido A"));
        boletas.add(new BoletaConcejales("Maria Lopez", "Partido B"));
        boletas.add(new BoletaLegisladores("Pedro Gomez", "Partido C"));

        List<Integer> cantidades = Arrays.asList(100, 80, 120);

        CentroComputos centro = new CentroComputos();
        centro.procesarVotos(boletas, cantidades);
    }
}