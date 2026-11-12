import java.util.ArrayList;
import java.util.List;

public class HubCentral {
    private List<Controlable> dispositivos = new ArrayList<>();

    public void agregarDispositivo(Controlable dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void enviarComando(String comando) {
        for (Controlable dispositivo : dispositivos) {
            dispositivo.ejecutarAccion(comando);
        }
    }
}