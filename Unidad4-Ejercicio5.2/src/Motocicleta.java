public class Motocicleta extends VehiculoCarrera {
    public Motocicleta(double combustible) {
        super(combustible);
    }

    @Override
    public void acelerar(int segundos) {
        velocidadActual += segundos * 12;
        combustible -= segundos * 0.4;
    }

    @Override
    public void obtenerDesempeno() {
        System.out.println("Motocicleta: " + velocidadActual +
                " km/h. Combustible: " + combustible);
    }
}