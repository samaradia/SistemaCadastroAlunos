package controller;

import view.TurmaView;

import java.util.Scanner;

public class TurmaController {
    private Scanner leitura;

    public TurmaController(Scanner leitura) {
        this.leitura = leitura;
    }

    public void cadastrarTurma(){
        TurmaView turmaView =  new TurmaView();
        turmaView.mostrarPergunta("Digite o número da turma: ");
        int turma = leitura.nextInt();
    }
}
