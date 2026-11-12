public class MonoplazaF1 extends VehiculoCarrera {
    public MonoplazaF1(double combustible) {
        super(combustible);
    }

    @Override
    public void acelerar(int segundos) {
        velocidadActual += segundos * 15;
        combustible -= segundos * 0.5;
    }

    @Override
    public void obtenerDesempeno() {
        System.out.println("Monoplaza F1: " + velocidadActual +
                " km/h. Combustible: " + combustible);
    }
}