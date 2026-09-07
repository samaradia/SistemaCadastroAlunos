package controller;

import model.Aluno;
import model.Turma;
import view.TurmaView;

import java.util.Scanner;

public class TurmaController {
    private Scanner leitura;

    public TurmaController(Scanner leitura) {
        this.leitura = leitura;
    }

    public void cadastrarTurma(Aluno aluno){
        TurmaView turmaView =  new TurmaView();
        turmaView.mostrarTurmas();

        turmaView.mostrarPergunta("Digite o número da turma: ");
        int turma = leitura.nextInt();

        Turma turmaObjeto = new Turma(turma);

        turmaObjeto.adicionarAlunos(aluno);

        turmaView.listarAlunos(turmaObjeto);
    }
}
