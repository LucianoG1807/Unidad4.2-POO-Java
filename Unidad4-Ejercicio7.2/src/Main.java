public class Main {
    public static void main(String[] args) {
        LiquidadorSueldos liquidador = new LiquidadorSueldos();

        liquidador.liquidar(new EmpleadoVentas("Juan", 800000));
        liquidador.liquidar(new EmpleadoSistemas("Maria", 900000));
        liquidador.liquidar(new EmpleadoRRHH("Pedro", 750000));
    }
}