public class AutoRally extends VehiculoCarrera {
    public AutoRally(double combustible) {
        super(combustible);
    }

    @Override
    public void acelerar(int segundos) {
        velocidadActual += segundos * 10;
        combustible -= segundos * 0.3;
    }

    @Override
    public void obtenerDesempeno() {
        System.out.println("Auto de rally: " + velocidadActual +
                " km/h. Combustible: " + combustible);
    }
}