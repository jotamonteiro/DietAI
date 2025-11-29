import controllers.AlunoController;
import model.Aluno;
import model.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        AlunoController ca = new AlunoController();

        int r;

        do{
            System.out.println("=========== Menu DietAI ==============");
            System.out.println("1 - Fazer Cadastro");
            System.out.println("2 - Consultar Lista de Personais");
            System.out.println("3 - Consultar Lista de Nuticionistas");
            System.out.println("0 - Sair");
            r = sc.nextInt();

            switch (r){
                case 1:
                ca.cadastrarAluno(a);
            }
        }while(r != 0);



    }
}