package view;

import model.Curso;

public class CursoView {
    public void mostrarCurso() {
        System.out.println("\n                  Curso                    ");
        System.out.println("=============================================");
    }
    public void mostrarPergunta(String pergunta) {
        System.out.println("\n" + pergunta);
    }

    public void exibirDisciplina(Curso curso){
        System.out.println("Sua disciplina é  " + curso.getDisciplina() + ".");
        System.out.println("Adicionado Com Sucesso!");
    }
}
