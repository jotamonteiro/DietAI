package services;

import enums.Categoria;
import enums.Genero;
import model.Aluno;
import model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AlunoService {
    static Scanner sc = new Scanner(System.in);
    static List<Aluno>alunos = new ArrayList<>();

    public static void cadastrarAluno(Aluno a){
        alunos.add(a);
    }

    public void listarAlunos(){
        System.out.println("============= Alunos ===========");
        for (int i = 0; i < alunos.size(); i++){
            System.out.println(i + " - " + alunos.get(i).getNome());
        }
        System.out.println("=================================");
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

    public static List<Aluno> getAlunos() {
        return alunos;
    }

    public void deletarAluno(String nome) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNome().equalsIgnoreCase(nome)) {
                alunos.remove(i);
                System.out.println("Deletado com sucesso!");
                return;
            }
            System.out.println("Aluno não encontrado.");
        }
    }

}