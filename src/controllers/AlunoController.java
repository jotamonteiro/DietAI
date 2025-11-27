package controllers;

import model.Aluno;
import services.AlunoService;

import java.util.List;

public class AlunoController {
    private AlunoService as = new AlunoService();

    public void cadastrarAluno(Aluno a){
        as.cadastrarAluno(a);
    }
    public List<Aluno> listarAlunos(){
        return as.listarAlunos();
    }
}
