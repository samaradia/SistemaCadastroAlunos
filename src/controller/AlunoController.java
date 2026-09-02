package controller;

import model.Aluno;
import view.AlunoView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlunoController {
    private Scanner leitura; //O AlunoController vai guardar um Scanner.

    public AlunoController(Scanner leitura) { //Quando alguém criar um AlunoController, ele precisa me entregar
        this.leitura = leitura;               // um Scanner. Eu vou guardar esse Scanner dentro de mim.

    }
    public Aluno cadastrarAluno(){
        AlunoView alunoView = new AlunoView();
        alunoView.mostrarCadastro();



        Pattern matriculaPattern = Pattern.compile("^\\d{1,10}$");

        String matricula;
        Matcher matriculaMatcher;

        do{
            alunoView.mostrarPergunta("Matricula: ");
            matricula = leitura.nextLine();

            matriculaMatcher = matriculaPattern.matcher(matricula);
            if (!matriculaMatcher.matches()){
                System.out.println("Matrícula inválida! Digite novamente.");
            }
        } while (!matriculaMatcher.matches());

        alunoView.mostrarPergunta("Nome: ");
        String nome = leitura.nextLine();

        Pattern cpfPattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");

        String cpf;
        Matcher cpfMatcher;

        do{
            alunoView.mostrarPergunta("CPF: ");
            cpf = leitura.nextLine();

            cpfMatcher = cpfPattern.matcher(cpf);
            if (!cpfMatcher.matches()){
                System.out.println("CPF inválido! Digite novamente.");
            }
        } while (!cpfMatcher.matches());


        alunoView.mostrarPergunta("Data de Nascimento: ");
        String dataTexto = leitura.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDeNascimento = LocalDate.parse(dataTexto, formato);

        alunoView.mostrarPergunta("E-mail: ");
        String email = leitura.nextLine();

        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Matcher emailMatcher = emailPattern.matcher(email);

        alunoView.mostrarPergunta("Telefone: ");
        String telefone = leitura.nextLine();

        Pattern telefonePattern = Pattern.compile("^\\(?\\d{2}\\)?\\s?\\d{4,5}-?\\d{4}$");
        Matcher telefoneMatcher = telefonePattern.matcher(telefone);

        Aluno aluno = new Aluno(matricula, nome, cpf, dataDeNascimento, email, telefone);
        alunoView.exibirDados(aluno);
        return aluno;




    }

}
