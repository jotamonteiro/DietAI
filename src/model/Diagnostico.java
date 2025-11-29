package model;

public class Diagnostico {

    public double calculoImc (double peso, double altura) {
        return peso / (altura*altura);
    }

    public String objetivo (double peso, double altura) {
        double imc = calculoImc(peso, altura);

        if (imc < 18.5) {
            return "Treino para ganho de Massa";
        } else if (imc < 25){
            return "Treino para Manutenção";
        } else {
            return "Treino para Perda de Gordura Corporal";
        }
    }

    public String recomendacao(String objetivo) {
        switch (objetivo) {
            case "Ganho de massa":
                return "Treino de hipertrofia + superávit calórico.";
            case "Manutenção":
                return "Treino equilibrado + dieta de manutenção.";
            case "Perda de gordura":
                return "Treino com cardio + déficit calórico.";
            default:
                return "";
        }
    }
}
