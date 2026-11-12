public class Main {
    public static void main(String[] args) {
        SistemaTarifario sistema = new SistemaTarifario();

        double peso = 5;
        double distancia = 100;

        sistema.cotizarEnvio(new EnvioTerrestre(500), peso, distancia);
        sistema.cotizarEnvio(new EnvioAereo(1000), peso, distancia);
        sistema.cotizarEnvio(new EnvioEcologico(300), peso, distancia);
    }
}