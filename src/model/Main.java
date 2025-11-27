package model;

import controllers.AlunoController;
import enums.Categoria;
import enums.Genero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa a = new Aluno();
        AlunoController ac = new AlunoController();
        Pessoa n1 = new Nutricionista("Fernanda","CRN-3 17263",Categoria.Intermediario,16271627,29);

        int r;

        do{
            System.out.println("=========== Menu DietAI ==============");
            System.out.println("1 - Fazer Cadastro");
            System.out.println("2 - Consultar Lista de Personais");
            System.out.println("3 - Consultar Lista de Nuticionistas");
            System.out.println("4 - Gerar meu Treino");
            System.out.println("5 - Gerar Minha Dieta");
            System.out.println("0 - Sair");
            r = sc.nextInt();

            switch (r){
                case 1:
                    System.out.println("Digite o Nome do Aluno: ");
                    a.setNome(sc.nextLine());
                    System.out.println("Digite o CPF do Aluno: ");
                    a.setCpf(sc.nextLine());
                    System.out.println("Qual o Genero do Aluno: \n 1 - Masculino\n 2 - Feminino \n 3 - Outro");
                    int r1 = sc.nextInt();
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
                    ((Aluno)a).setPeso(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Qual seu Nivel de Experiencia na Musculação: \n 1 - Iniciante \n 2 - Intermediario \n  3 - Avançado");
                    int r2 = sc.nextInt();
                    if(r2 == 1){
                        ((Aluno)a).setExp(Categoria.Iniciante);
                    } else if (r2 == 2) {
                        ((Aluno)a).setExp(Categoria.Intermediario);
                    } else if (r2 == 3) {
                        ((Aluno)a).setExp(Categoria.Avançado);
                    }else {
                        System.out.println("Numero Invalido");
                    }
                    System.out.printf("Aluno %s, Cadastrado com Sucesso", a.getNome());;
            }
        }while(r != 0);



    }
}