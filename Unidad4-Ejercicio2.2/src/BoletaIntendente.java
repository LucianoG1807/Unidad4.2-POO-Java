public class BoletaIntendente extends BoletaElectoral {
    public BoletaIntendente(String nombre, String partido) {
        super(nombre, partido);
    }

    @Override
    public int contarVoto(int cantidadEmitida) {
        return Math.max(0, cantidadEmitida);
    }
}