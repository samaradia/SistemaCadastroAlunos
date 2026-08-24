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

    //Crie um método público que permita que outra classe pegue a lista de alunos.
    public ArrayList<Aluno> getAlunos(){
        return alunos;
    }


}
