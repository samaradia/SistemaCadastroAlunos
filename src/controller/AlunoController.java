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
    public void cadastrarAluno(){
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
    }

}
