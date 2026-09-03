package model;

public class Frequencia {

  private Aluno aluno;
  private int aulasPresentes;
  private int aulasFaltadas;

    public Frequencia(Aluno aluno, int aulasPresentes, int aulasFaltas) {
        this.aluno = aluno;
        this.aulasPresentes = aulasPresentes;
        this.aulasFaltadas = aulasFaltas;
    }

    public double calcularFrequencia(){
        // Primeiro calculamos o total de aulas:
        // aulas presentes + aulas faltadas
        int totalAulas = aulasPresentes + aulasFaltadas;

        // Para descobrir a porcentagem:
        // aulas presentes ÷ total de aulas × 100
        return (double) aulasPresentes / totalAulas * 100;
    }

    public String VerificarFrequencia(){
        if(calcularFrequencia() >= 75){
            return "Frequência sufiente!";
        } else {
            return "Frequência insufiente!";
        }
    }

}
