package view;

import model.Aluno;

public class AlunoView {
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
