package services;

import model.Aluno;
import model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AlunoService {
    Pessoa a = new Aluno();
    Scanner sc = new Scanner(System.in);
    List<Aluno>alunos = new ArrayList<>();

    public void cadastrarAluno(Aluno a){
        alunos.add(a);
    }
    public List<Aluno> listarAlunos(){
        return alunos;
    }
    public void atualizarAluno(String nome, String nvNome){
        for (Aluno a : alunos){
            if (a.getNome().equalsIgnoreCase(nome)){
                a.setNome(nvNome);
                System.out.println("Nome Alterado com Sucesso!!");
            } else {
                System.out.println("Aluno Não Encontrado");
            }
        }
    }


}