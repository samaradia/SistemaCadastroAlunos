package view;

import model.Notas;

public class NotasView {
    public void mostrarNotas() {
        System.out.println("\n                    NOTAS                  ");
        System.out.println("=============================================");
    }

    public void mostrarPergunta(String pergunta) {
        System.out.println("\n" + pergunta);
    }

    public void exibirResultado(Notas nota) {
        System.out.printf("\nA média: %.2f%n", nota.calcularMedia());
        System.out.println(nota.verificarAprovacao());
    }
}
