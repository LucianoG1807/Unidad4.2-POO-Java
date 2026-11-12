public class ControlVencimientos {
    public void procesarDevolucion(Prestable material, int dias) {
        double multa = material.calcularMultaDemora(dias);

        System.out.println("Días de atraso: " + dias);
        System.out.println("Multa: $" + multa);
    }
}