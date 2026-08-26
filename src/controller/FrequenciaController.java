package controller;

import model.Aluno;
import model.Frequencia;
import view.FrequenciaView;

import java.util.Scanner;

public class FrequenciaController {
    private Scanner leitura;

    public FrequenciaController(Scanner leitura) {
        this.leitura = leitura;
    }


    public void cadastrarFrequencia(Aluno aluno){
        FrequenciaView frequenciaView = new FrequenciaView();
        frequenciaView.mostrarFrequencia();

        frequenciaView.mostrarPergunta("Digite o número de aulas presentes: ");
        int aulasPresentes = leitura.nextInt();

        frequenciaView.mostrarPergunta("Digite o número de aulas faltadas: ");
        int aulasFaltadas = leitura.nextInt();

        Frequencia frequencia = new Frequencia(aluno, aulasPresentes, aulasFaltadas);
        frequenciaView.exibirResltado(frequencia);
    }
}
