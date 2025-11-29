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
        int r1,r2;
            System.out.println("Digite o Nome do model.Aluno(a): ");
            a.setNome(sc.nextLine());

            System.out.println("Digite o CPF do model.Aluno(a): ");
            a.setCpf(sc.nextLine());

            System.out.println("Qual o enums.Genero do model.Aluno: \n 1 - Masculino\n 2 - Feminino \n 3 - Outro");
            r1 = sc.nextInt();
            if (r1 == 1){
                a.setGenero(Genero.Masculino);
            } else if (r1 == 2) {
                a.setGenero(Genero.Feminino);
            } else if (r1 == 3){
                a.setGenero(Genero.Outro);
            } else {
                System.out.println("Numero Incorreto");
            }

            System.out.println("Digite o Peso: ");
            a.setPeso(sc.nextDouble());
            sc.nextLine();

            System.out.println("Qual seu Nivel de Experiencia na Musculação: \n 1 - Iniciante \n 2 - Intermediario \n  3 - Avançado");
            r2 = sc.nextInt();
            if(r2 == 1){
                a.setExp(Categoria.Iniciante);
            } else if (r2 == 2) {
                a.setExp(Categoria.Intermediario);
            } else if (r2 == 3) {
                a.setExp(Categoria.Avançado);
            }else {
                System.out.println("Numero Invalido");
            }

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