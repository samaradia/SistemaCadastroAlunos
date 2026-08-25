package view;

import model.Aluno;
import model.Turma;

public class TurmaView {
    public void mostrarTurmas() {
        System.out.println("\n                   TURMA!                 ");
        System.out.println("============================================");
    }

    public void mostrarPergunta(String pergunta) {
        System.out.println("\n" + pergunta);
    }

    public void listarAlunos(Turma turma) {
        for (Aluno aluno : turma.getAlunos()) {
            System.out.println(aluno.getNome());
        }
    }



}