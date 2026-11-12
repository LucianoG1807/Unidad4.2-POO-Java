public class SistemaTarifario {
    public void cotizarEnvio(MetodoEnvio metodo, double pesoKg, double distanciaKm) {
        double tarifa = metodo.calcularTarifa(pesoKg, distanciaKm);

        System.out.println("Costo estimado: $" + tarifa);
    }
}