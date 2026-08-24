package view;

import model.Frequencia;

public class FrequenciaView {
    public void mostrarFrequencia(Frequencia frequencia){
        System.out.println("\n                FREQUÊNCIA                   ");
        System.out.println("===============================================");
        System.out.println("\nDigite as aulas presentes: ");
        System.out.println("\nDigite as aulas faltadas: ");
        System.out.println("\nTotal de frequência: " + frequencia.calcularFrequencia());
        System.out.println(frequencia.VerificarFrequencia());
    }
}
