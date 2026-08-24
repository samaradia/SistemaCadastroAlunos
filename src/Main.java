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

        AlunoView alunoView = new AlunoView();
        alunoView.mostrarCadastro();

        alunoView.mostrarPergunta("Matricula: ");
        String matricula = leitura.nextLine();

        Pattern pattern3 = Pattern.compile("^\\d{1,10}$");
        Matcher matcher3 = pattern3.matcher(matricula);

        alunoView.mostrarPergunta("Nome: ");
        String nome = leitura.nextLine();

        alunoView.mostrarPergunta("CPF: ");
        String cpf = leitura.nextLine();

        Pattern pattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
        Matcher matcher = pattern.matcher(cpf);

        alunoView.mostrarPergunta("Data de Nascimento: ");
        String dataTexto = leitura.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDeNascimento = LocalDate.parse(dataTexto, formato);

        alunoView.mostrarPergunta("E-mail: ");
        String email = leitura.nextLine();

        Pattern pattern1 = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Matcher matcher1 = pattern1.matcher(email);

        alunoView.mostrarPergunta("Telefone: ");
        String telefone = leitura.nextLine();

        Pattern pattern2 = Pattern.compile("^\\(?\\d{2}\\)?\\s?\\d{4,5}-?\\d{4}$");
        Matcher matcher2 = pattern2.matcher(telefone);

        Aluno aluno = new Aluno(matricula, nome, cpf, dataDeNascimento, email, telefone);

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
       alunoView.alunoCadastrado();
       alunoView.exibirDados(aluno);



    }
}