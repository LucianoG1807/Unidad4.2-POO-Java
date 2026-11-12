public abstract class VehiculoCarrera {
    protected double velocidadActual;
    protected double combustible;

    public VehiculoCarrera(double combustible) {
        this.combustible = combustible;
        this.velocidadActual = 0;
    }

    public abstract void acelerar(int segundos);

    public abstract void obtenerDesempeno();
}