public class PersianaMotorizada implements Controlable {
    private boolean abierta;

    @Override
    public void ejecutarAccion(String comando) {
        if (comando.equalsIgnoreCase("abrir")) {
            abierta = true;
        } else if (comando.equalsIgnoreCase("cerrar")) {
            abierta = false;
        }

        System.out.println("Persiana: " + (abierta ? "abierta" : "cerrada"));
    }
}