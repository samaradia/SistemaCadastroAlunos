import controller.AlunoController;
import controller.FrequenciaController;
import controller.NotasController;
import controller.TurmaController;
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

        TurmaController turmaController = new TurmaController(leitura);

        NotasController notasController = new NotasController(leitura);

        FrequenciaController frequenciaController = new FrequenciaController(leitura);


       leitura.close();
       //alunoView.alunoCadastrado();
      // alunoView.exibirDados(aluno);



    }
}