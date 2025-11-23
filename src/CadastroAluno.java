import java.util.Scanner;


public class CadastroAluno {
    Aluno a = new Aluno();
    Scanner sc = new Scanner(System.in);
    int r1,r2;

    public void cadastrarAluno(){
        System.out.println("Digite o Nome do Aluno(a): ");
        a.setNome(sc.nextLine());
        System.out.println("Digite o CPF do Aluno(a): ");
        a.setCpf(sc.nextLine());
        System.out.println("Qual o Genero do Aluno: \n 1 - Masculino\n 2 - Feminino \n 3 - Outro");
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

    }
}