public class TesisPrestamo implements Prestable {
    @Override
    public double calcularMultaDemora(int diasAtraso) {
        return Math.max(0, diasAtraso) * 200;
    }
}