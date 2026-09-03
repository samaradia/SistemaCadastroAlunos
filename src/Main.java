import controller.*;
import model.Aluno;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        AlunoController alunoController = new AlunoController(leitura);
        Aluno aluno = alunoController.cadastrarAluno();

        TurmaController turmaController = new TurmaController(leitura);
        turmaController.cadastrarTurma();

        NotasController notasController = new NotasController(leitura);
        notasController.cadastrarNotas(aluno);

        FrequenciaController frequenciaController = new FrequenciaController(leitura);
        frequenciaController.cadastrarFrequencia(aluno);

        CursoController cursoController = new CursoController(leitura);
        cursoController.cadastrarCurso();
        alunoController.mostrarMenu();













    }
}