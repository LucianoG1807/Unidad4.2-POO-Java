public class AireAcondicionado implements Controlable {
    private int temperatura = 24;

    @Override
    public void ejecutarAccion(String comando) {
        if (comando.equalsIgnoreCase("subir")) {
            temperatura++;
        } else if (comando.equalsIgnoreCase("bajar")) {
            temperatura--;
        }

        System.out.println("Aire acondicionado: " + temperatura + " grados.");
    }
}