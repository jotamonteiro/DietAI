package controllers;
import model.Aluno;
import model.Pessoa;
import services.AlunoService;
import java.util.Scanner;


public class AlunoController {
    Scanner sc = new Scanner(System.in);
    AlunoService as = new AlunoService();

    public void cadastrarAluno(Aluno a){
        AlunoService.cadastrarAluno(a);
    }
}