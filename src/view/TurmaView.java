package view;

import model.Aluno;
import model.Turma;

public class TurmaView {
    public void listarAlunos(Turma turma){
        for(Aluno aluno: turma.getAlunos()){
            System.out.println(aluno.getNome());
        }
    }
}
