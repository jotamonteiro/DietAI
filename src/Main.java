import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa a = new Aluno();
        CadastroAluno ca = new CadastroAluno();

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
                ca.cadastrarAluno();
            }
        }while(r != 0);



    }
}