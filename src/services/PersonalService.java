package services;

import enums.Objetivo;
import model.Aluno;
import model.Pessoa;

import static enums.Objetivo.*;

public class PersonalService {
    Pessoa a = new Aluno();


    public double calculoImc (double peso, double altura) {
        return peso / (altura*altura);
    }

    public void objetivo (double peso, double altura, Aluno a) {
        double imc = peso / (altura*altura);
        System.out.println("===========================");
        System.out.println("IMC: " + imc);
        a.setImc(imc);

        if (imc < 18.5) {
            (a).setObjetivo(GanharMassa);
            System.out.println("TIPO: Treino para ganho de Massa");
        } else if (imc < 25){
            (a).setObjetivo(Manutenção);
            System.out.println("TIPO: Treino para Manutenção");;
        } else {
            (a).setObjetivo(PerderPeso);
            System.out.println("TIPO: Treino para Perda de Gordura Corporal");
        }
    }

    public void recomendacao(Aluno a) {
        Objetivo objtv = a.getObjetivo();
        System.out.println("============ Recomendado =============");
        switch (objtv) {
            case GanharMassa:
                System.out.println(a.getNome() + ": Treino de hipertrofia + superávit calórico.");
                break;
            case Manutenção:
                System.out.println(a.getNome() + ": Treino equilibrado + dieta de manutenção.");
                break;
            case PerderPeso:
                System.out.println(a.getNome() + ": Treino com cardio + déficit calórico.");
                break;
            default:
                break;
        }
    }
}
