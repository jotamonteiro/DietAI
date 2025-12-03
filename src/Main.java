import controllers.AlunoController;
import controllers.NutricionistaController;
import controllers.PersonalController;
import enums.Categoria;
import enums.Genero;
import model.Aluno;
import model.Nutricionista;
import model.Personal;
import model.Pessoa;
import services.NutricionistaService;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa a = new Aluno();
        AlunoController ca = new AlunoController();
        PersonalController pc = new PersonalController();
        NutricionistaController nc = new NutricionistaController();

        // Registrando Profissionais
        Pessoa nutri1 = new Nutricionista("Fernanda Montenegro", "CRN-3 19283", Categoria.Iniciante, "121212121", 41, Genero.Feminino);
        Pessoa nutri2 = new Nutricionista("João Vitor", "CRN-6 12031", Categoria.Intermediario,"1233342323",29,Genero.Masculino );
        Pessoa nutri3 = new Nutricionista("Felipe Ret","CRN-3 10293", Categoria.Avançado, "1212131244", 39,Genero.Masculino );
        Pessoa personal1 = new Personal("Jefferson Soares", "121212121",29,Genero.Masculino,Categoria.Iniciante,"129233-G/PB");
        Pessoa personal2 = new Personal("Cleison Martins", "181818181", 51, Genero.Masculino,Categoria.Intermediario,"192830-G/PB");
        Pessoa personal3 = new Personal("Beatriz Cabral", "1927836432", 25,Genero.Feminino,Categoria.Avançado,"298302-G/SP");

        int r;
        // Menu do Programa
        do{
            System.out.println("=========== Menu DietAI ==============");
            System.out.println("1 - Fazer Cadastro");
            System.out.println("2 - Consultar Lista de Personais");
            System.out.println("3 - Consultar Lista de Nuticionistas");
            System.out.println("4 - Listar Alunos");
            System.out.println("5 - Realizar Consulta com o Personal");
            System.out.println("6 = Realizar Consulta com o Nutricionista");
            System.out.println("0 - Sair");
            r = sc.nextInt();
            sc.nextLine();
            switch (r){
                case 1:
                    int r1,r2;
                    Aluno a1 = new Aluno();
                    System.out.println("Digite o Nome do Aluno(a): ");
                    a1.setNome(sc.nextLine());

                    System.out.println("Digite o CPF do Aluno(a): ");
                    a1.setCpf(sc.nextLine());

                    System.out.println("Qual o Genero do Aluno: \n 1 - Masculino\n 2 - Feminino \n 3 - Outro");
                    r1 = sc.nextInt();
                    if (r1 == 1){
                        a1.setGenero(Genero.Masculino);
                    } else if (r1 == 2) {
                        a1.setGenero(Genero.Feminino);
                    } else if (r1 == 3){
                        a1.setGenero(Genero.Outro);
                    } else {
                        System.out.println("Numero Incorreto");
                    }

                    System.out.println("Digite o Peso: ");
                    a1.setPeso(sc.nextDouble());
                    sc.nextLine();

                    System.out.println("Digite a Idade do Aluno: ");
                    a1.setIdade(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Digite a Altura do Aluno: ");
                    a1.setAltura(sc.nextDouble());
                    sc.nextLine();


                    System.out.println("Qual seu Nivel de Experiencia na Musculação: \n 1 - Iniciante \n 2 - Intermediario \n  3 - Avançado");
                    r2 = sc.nextInt();
                    if(r2 == 1){
                        a1.setExp(Categoria.Iniciante);
                    } else if (r2 == 2) {
                        a1.setExp(Categoria.Intermediario);
                    } else if (r2 == 3) {
                        a1.setExp(Categoria.Avançado);
                    }else {
                        System.out.println("Numero Invalido");
                    }

                    ca.cadastrarAluno(a1);
                    break;
                case 2:
                    System.out.println(personal1);
                    System.out.println(personal2);
                    System.out.println(personal3);
                    break;
                case 3:
                    System.out.println(nutri1);
                    System.out.println(nutri2);
                    System.out.println(nutri3);
                    break;
                case 4:
                    ca.listarAlunos();
                    System.out.println("==============================");
                    System.out.println("1 - Alterar Nome do Aluno");
                    System.out.println("2 - Deletar Aluno");
                    System.out.println("0 - Sair");
                    System.out.println("===============================");

                    int r5 = sc.nextInt();
                    sc.nextLine();

                    switch (r5){
                        case 1:
                            System.out.println("Digite o nome ANTIGO do Aluno: ");
                            String nAntigo = sc.nextLine();
                            System.out.println("Digite o Nome NOVO do Aluno: ");
                            String nvNome = sc.nextLine();
                            ca.atualizarAluno(nAntigo,nvNome);
                            break;
                        case 2:
                            System.out.println("Digite o nome do Aluno que deseja DELETAR: ");
                            String nDel = sc.nextLine();
                            ca.deletarAluno(nDel);
                    }

                    break;
                case 5:
                    // É IMPORTATE QUE PARA VER A RECOMEDAÇÃO DE TREINO, VOCÊ PRIMERIO FAÇA A CONSULTA!!!!!

                    ca.listarAlunos();
                    System.out.println("Digite o número do aluno para consulta: ");
                    int i = sc.nextInt();
                    sc.nextLine();

                    if(i < 0 || i >= ca.getAlunos().size()){
                        System.out.println("Aluno não encontrado!");
                        break;
                    }

                    Aluno alunoSelecionado = ca.getAlunos().get(i);

                    System.out.println("1 - Consultar Objetivos de Acordo Com o IMC");
                    System.out.println("2 - Recomendação de Treino");
                    int x = sc.nextInt();
                    sc.nextLine();

                    switch (x){
                        case 1:
                            pc.objetivo(alunoSelecionado.getPeso(), alunoSelecionado.getAltura(), alunoSelecionado);
                            break;
                        case 2:
                            pc.recomendacao(alunoSelecionado);
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;
                case 6:
                    ca.listarAlunos();
                    System.out.println("Digite o número do aluno para consulta: ");
                    int i2 = sc.nextInt();
                    sc.nextLine();

                    if(i2 < 0 || i2 >= ca.getAlunos().size()){
                        System.out.println("Aluno não encontrado!");
                        break;
                    }

                    Aluno alunoSelecionado2 = ca.getAlunos().get(i2);

                    System.out.println("1 - Fazer Dieta");
                    int r3 = sc.nextInt();
                    sc.nextLine();
                    if (r3 == 1){
                        nc.fazerDieta(alunoSelecionado2);
                    }
                    break;
            }
        }while(r != 0);



    }
}