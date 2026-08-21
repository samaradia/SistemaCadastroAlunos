import model.Aluno;
import model.Frequencia;
import model.Notas;
import view.AlunoView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("\n            CADASTRAR ALUNOS           ");
        System.out.println("=========================================");

        System.out.println("\nMatricula: ");
        String matricula = leitura.nextLine();

        Pattern pattern3 = Pattern.compile("^\\d{1,10}$");
        Matcher matcher3 = pattern3.matcher(matricula);

        System.out.println("\nNome: ");
        String nome = leitura.nextLine();


        System.out.println("\nCPF: ");
        String cpf = leitura.nextLine();

        Pattern pattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
        Matcher matcher = pattern.matcher(cpf);

        System.out.println("\nData de nascimento (dd/MM/yyyy): ");
        String dataTexto = leitura.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDeNascimento = LocalDate.parse(dataTexto, formato);

        System.out.println("\nE-mail: ");
        String email = leitura.nextLine();

        Pattern pattern1 = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Matcher matcher1 = pattern1.matcher(email);

        System.out.println("\nTelefone: ");
        String telefone = leitura.nextLine();

        Pattern pattern2 = Pattern.compile("^\\(?\\d{2}\\)?\\s?\\d{4,5}-?\\d{4}$");
        Matcher matcher2 = pattern2.matcher(telefone);

        Aluno aluno = new Aluno(matricula, nome, cpf, dataDeNascimento, email, telefone);

        System.out.println("\n                   TURMA!                 ");
        System.out.println("============================================");

        System.out.println("\nDigita o número da turma: ");
        int turma = leitura.nextInt();

        System.out.println("\nmodel.Aluno adicionado!");

        System.out.println("\n                    NOTAS                  ");
        System.out.println("=============================================");

        System.out.println("\nNota1: ");
        double nota1 = leitura.nextDouble();

        System.out.println("Nota2: ");
        double nota2 = leitura.nextDouble();

        System.out.println("Nota3: ");
        double nota3 = leitura.nextDouble();

        Notas nota = new Notas(aluno, nota1, nota2, nota3);

        System.out.printf("\nA média: %.2f%n", nota.calcularMedia());
        System.out.println(nota.verificarAprovacao());

        System.out.println("\n                FREQUÊNCIA                   ");
        System.out.println("===============================================");

        System.out.println("\nDigite as aulas presentes: ");
        int aulasPresentes = leitura.nextInt();

        System.out.println("\nDigite as aulas faltadas: ");
        int aulasFaltadas = leitura.nextInt();

        Frequencia frequencia = new Frequencia(aluno, aulasPresentes, aulasFaltadas);
        System.out.println("\nTotal de frequência: " + frequencia.calcularFrequencia());
        System.out.println(frequencia.VerificarFrequencia());

        System.out.println("\n              ALUNO CADASTRADO!             ");
        System.out.println("==============================================");

        AlunoView alunoView = new AlunoView();
        alunoView.exibirDados(aluno);



    }
}