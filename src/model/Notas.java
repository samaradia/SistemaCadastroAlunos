package model;

public class Notas {
    private Aluno aluno;
    private double nota1;
    private double nota2;
    private double nota3;

    public Notas(Aluno aluno, double nota1, double nota2, double nota3) {
        this.aluno = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String verificarAprovacao() {
        if (calcularMedia() >= 7) {
            return "Você foi aprovado!";
        } else if (calcularMedia() >= 5) {
            return "Você está de recuperação!";
        } else {
            return "Você foi reprovado!";
        }

        }
    }


