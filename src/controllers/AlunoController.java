package controllers;
import model.Aluno;
import model.Pessoa;
import services.AlunoService;

import java.util.List;
import java.util.Scanner;


public class AlunoController {
    AlunoService as = new AlunoService();

    public void cadastrarAluno(Aluno a){
        AlunoService.cadastrarAluno(a);
    }

    public void listarAlunos(){
        as.listarAlunos();
    }


    public List<Aluno> getAlunos() {
        return as.getAlunos();
    }

    public void atualizarAluno(String nome, String nvNome){
        as.atualizarAluno(nome,nvNome);
    }

    public void deletarAluno(String nome){
        as.deletarAluno(nome);
    }
}