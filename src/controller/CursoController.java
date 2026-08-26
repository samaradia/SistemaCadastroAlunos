package controller;

import model.Curso;
import view.CursoView;

import java.util.Scanner;

public class CursoController {
    private Scanner leitura;

    public CursoController(Scanner leitura) {
        this.leitura = leitura;
    }

    public void cadastrarCurso(){

        CursoView cursoView = new CursoView();
        cursoView.mostrarCurso();

        cursoView.mostrarPergunta("Digite qual curso você irá fazer: ");
        leitura.nextLine();
        String curso = leitura.nextLine();
        Curso cursos = new Curso(curso);
        cursoView.exibirDisciplina(cursos);


    }

}
