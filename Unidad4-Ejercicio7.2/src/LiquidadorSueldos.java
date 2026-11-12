public class LiquidadorSueldos {
    public void liquidar(TrabajadorCorporativo trabajador) {
        double bono = trabajador.calcularBonoAnual();
        double total = trabajador.sueldoBase + bono;

        System.out.println("Empleado: " + trabajador.nombre);
        System.out.println("Sueldo base: $" + trabajador.sueldoBase);
        System.out.println("Bono anual: $" + bono);
        System.out.println("Total a abonar: $" + total);
        System.out.println("--------------------");
    }
}