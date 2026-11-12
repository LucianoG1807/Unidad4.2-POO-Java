public class BoletaConcejales extends BoletaElectoral {
    public BoletaConcejales(String nombre, String partido) {
        super(nombre, partido);
    }

    @Override
    public int contarVoto(int cantidadEmitida) {
        return Math.max(0, cantidadEmitida - 2);
    }
}