package model;

import java.util.ArrayList;

public class Turma {
    private int numeroDaTurma;
    private ArrayList<Aluno> alunos;

    public Turma(int numeroDaTurma) {
        this.numeroDaTurma = numeroDaTurma;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAlunos(Aluno aluno){
        alunos.add(aluno);
    }
    public void listarAlunos(){
        for(Aluno aluno: alunos){
            System.out.println(aluno.getNome());
        }

    }

}
