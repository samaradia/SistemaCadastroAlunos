package view;

import model.Notas;

public class NotasView {
    public void mostrarNotas(Notas notas){
        System.out.println("\n                    NOTAS                  ");
        System.out.println("=============================================");
        System.out.println("\nNota1: ");
        System.out.println("Nota2: ");
        System.out.println("Nota3: ");
        System.out.printf("\nA média: %.2f%n", notas.calcularMedia());
        System.out.println(notas.verificarAprovacao());
    }
}
