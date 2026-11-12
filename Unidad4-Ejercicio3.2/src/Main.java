public class Main {
    public static void main(String[] args) {
        SistemaMonitoreo sistema = new SistemaMonitoreo();

        sistema.activarAlerta(new AlertaTormenta(), 90);
        sistema.activarAlerta(new AlertaCalor(), 42);
        sistema.activarAlerta(new AlertaViento(), 60);
    }
}