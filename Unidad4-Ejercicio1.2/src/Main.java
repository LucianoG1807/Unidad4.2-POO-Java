public class Main {
    public static void main(String[] args) {
        HubCentral hub = new HubCentral();

        hub.agregarDispositivo(new FocoInteligente());
        hub.agregarDispositivo(new AireAcondicionado());
        hub.agregarDispositivo(new PersianaMotorizada());

        System.out.println("Enviando comando:");
        hub.enviarComando("encender");
    }
}