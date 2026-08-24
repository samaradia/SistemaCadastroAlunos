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

        AlunoView alunoView = new AlunoView();
        alunoView.mostrarCadastro();

        String matricula = leitura.nextLine();

        Pattern pattern3 = Pattern.compile("^\\d{1,10}$");
        Matcher matcher3 = pattern3.matcher(matricula);

        String nome = leitura.nextLine();

        String cpf = leitura.nextLine();

        Pattern pattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
        Matcher matcher = pattern.matcher(cpf);

        String dataTexto = leitura.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDeNascimento = LocalDate.parse(dataTexto, formato);

        String email = leitura.nextLine();

        Pattern pattern1 = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Matcher matcher1 = pattern1.matcher(email);

        String telefone = leitura.nextLine();

        Pattern pattern2 = Pattern.compile("^\\(?\\d{2}\\)?\\s?\\d{4,5}-?\\d{4}$");
        Matcher matcher2 = pattern2.matcher(telefone);

        Aluno aluno = new Aluno(matricula, nome, cpf, dataDeNascimento, email, telefone);

       ;
        int turma = leitura.nextInt();

        double nota1 = leitura.nextDouble();

        double nota2 = leitura.nextDouble();

        double nota3 = leitura.nextDouble();

        Notas nota = new Notas(aluno, nota1, nota2, nota3);

        int aulasPresentes = leitura.nextInt();

        int aulasFaltadas = leitura.nextInt();

        Frequencia frequencia = new Frequencia(aluno, aulasPresentes, aulasFaltadas);

       leitura.close();
       alunoView.alunoCadastrado();
       alunoView.exibirDados(aluno);



    }
}