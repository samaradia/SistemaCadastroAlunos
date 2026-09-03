package controller;

import model.Aluno;
import model.Notas;
import view.NotasView;

import java.util.Scanner;

public class NotasController {

    private Scanner leitura;

    public NotasController(Scanner leitura) {
        this.leitura = leitura;
    }

    public void cadastrarNotas(Aluno aluno) {
    NotasView notasView = new NotasView();
    notasView.mostrarNotas();
    notasView.mostrarPergunta("Digite nota1: ");
    double nota1 = leitura.nextDouble();

    notasView.mostrarPergunta("Digite nota2: ");
    double nota2 = leitura.nextDouble();

    notasView.mostrarPergunta("Digite nota3: ");
    double nota3 = leitura.nextDouble();

    Notas nota = new Notas(aluno, nota1, nota2, nota3);
    notasView.exibirResultado(nota);
}

}
