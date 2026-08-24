package view;

import model.Aluno;
import model.Turma;

public class TurmaView {
    public void listarAlunos(Turma turma) {
        for (Aluno aluno : turma.getAlunos()) {
            System.out.println(aluno.getNome());
        }
    }

    public void mostrarTurmas() {
        System.out.println("\n                   TURMA!                 ");
        System.out.println("============================================");
        System.out.println("\nDigita o número da turma: ");
        System.out.println("\nmodel.Aluno adicionado!");
    }
}