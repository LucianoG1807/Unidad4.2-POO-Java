public class FocoInteligente implements Controlable {
    private boolean encendido;

    @Override
    public void ejecutarAccion(String comando) {
        if (comando.equalsIgnoreCase("encender")) {
            encendido = true;
        } else if (comando.equalsIgnoreCase("apagar")) {
            encendido = false;
        }

        System.out.println("Foco: " + (encendido ? "encendido" : "apagado"));
    }
}