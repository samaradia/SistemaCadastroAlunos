import controller.AlunoController;
import model.Aluno;
import model.Frequencia;
import model.Notas;
import model.Turma;
import view.AlunoView;
import view.FrequenciaView;
import view.NotasView;
import view.TurmaView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        AlunoController alunoController = new AlunoController(leitura);


        TurmaView turmaView =  new TurmaView();
        turmaView.mostrarPergunta("Digite o número da turma: ");
        int turma = leitura.nextInt();


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


        FrequenciaView frequenciaView = new FrequenciaView();
        frequenciaView.mostrarFrequencia();

        frequenciaView.mostrarPergunta("Digite o número de aulas presentes: ");
        int aulasPresentes = leitura.nextInt();

        frequenciaView.mostrarPergunta("Digite o número de aulas faltadas: ");
        int aulasFaltadas = leitura.nextInt();

        Frequencia frequencia = new Frequencia(aluno, aulasPresentes, aulasFaltadas);
        frequenciaView.exibirResltado(frequencia);

       leitura.close();
       //alunoView.alunoCadastrado();
      // alunoView.exibirDados(aluno);



    }
}