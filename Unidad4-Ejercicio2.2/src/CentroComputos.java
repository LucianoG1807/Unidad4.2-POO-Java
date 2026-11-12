import java.util.List;

public class CentroComputos {
    public void procesarVotos(List<BoletaElectoral> boletas, List<Integer> cantidades) {
        int total = 0;

        for (int i = 0; i < boletas.size(); i++) {
            int votos = boletas.get(i).contarVoto(cantidades.get(i));

            System.out.println(
                    boletas.get(i).nombreCandidato + " (" +
                            boletas.get(i).partidoPolitico + "): " + votos + " votos válidos."
            );

            total += votos;
        }

        System.out.println("Total de votos válidos: " + total);
    }
}