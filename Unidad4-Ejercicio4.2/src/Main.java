public class Main {
    public static void main(String[] args) {
        ControlVencimientos control = new ControlVencimientos();

        control.procesarDevolucion(new LibroPrestamo(), 5);
        control.procesarDevolucion(new RevistaPrestamo(), 5);
        control.procesarDevolucion(new TesisPrestamo(), 5);
    }
}