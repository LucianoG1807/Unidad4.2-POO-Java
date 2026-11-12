public class BoletaLegisladores extends BoletaElectoral {
    public BoletaLegisladores(String nombre, String partido) {
        super(nombre, partido);
    }

    @Override
    public int contarVoto(int cantidadEmitida) {
        return Math.max(0, (int) (cantidadEmitida * 0.95));
    }
}