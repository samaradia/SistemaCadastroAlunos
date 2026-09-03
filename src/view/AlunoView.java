package view;

import model.Aluno;

import java.util.Scanner;

public class AlunoView {
    public void mostrarCadastro() {
        System.out.println("\n            CADASTRAR ALUNOS           ");
        System.out.println("=========================================");
    }

    public void mostrarPergunta(String pergunta) {
        System.out.println("\n" + pergunta);
    }

    public void mostrarMenu(){
        System.out.println("=================================");
        System.out.println("1 - Cadastrar novo aluno.");
        System.out.println("2 - Encerrar.");
    }
    public  void mostrarMensagens(String mensagens){
        System.out.println("\n" + mensagens);
    }

    public void alunoCadastrado(){
        System.out.println("\n      ALUNO CADASTRADO!        ");
        System.out.println("=================================");
    }

    public void exibirDados(Aluno aluno) {
        System.out.println("=================================");
        System.out.println("          DADOS DO ALUNO");
        System.out.println("=================================");
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Data de nascimento: " + aluno.getCpf());
        System.out.println("E-mail: " + aluno.getEmail());
        System.out.println("Telefone: " + aluno.getTelefone());
    }


}
