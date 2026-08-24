package view;

import model.Frequencia;

public class FrequenciaView {
    public void mostrarFrequencia(){
        System.out.println("\n                FREQUÊNCIA                   ");
        System.out.println("===============================================");
    }
    public void mostrarPergunta(String pergunta) {
        System.out.println("\n" + pergunta);
    }

    public void exibirResltado(Frequencia frequencia){
        System.out.println("\nTotal de frequência: " + frequencia.calcularFrequencia());
        System.out.println(frequencia.VerificarFrequencia());
    }
}
