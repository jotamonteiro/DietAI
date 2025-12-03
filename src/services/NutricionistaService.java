package services;


import enums.Categoria;
import enums.Objetivo;
import model.Aluno;

public class NutricionistaService {

    public void fazerDieta(Aluno a){
        if(a.getObjetivo() == Objetivo.GanharMassa && a.getExp() == Categoria.Iniciante){
            System.out.println("============ Dr. Fernanda Montenegro =========================");
            System.out.println("Dieta: comer a cada 3h, ovos + aveia no café, arroz/feijão/frango no almoço, etc.");

        } else if (a.getObjetivo() == Objetivo.GanharMassa && a.getExp() == Categoria.Intermediario) {
            System.out.println("============ Dr. João Vitor =========================");
            System.out.println("Dieta: carbo complexos, omelete, batata doce com frango, etc.");

        } else if (a.getObjetivo() == Objetivo.GanharMassa && a.getExp() == Categoria.Avançado) {
            System.out.println("============ Dr. Felipe Ret =========================");
            System.out.println("Dieta: 5–6 refeições, 2 almoços, pós-treino rápido, etc.");

        } else if (a.getObjetivo() == Objetivo.Manutenção && a.getExp() == Categoria.Iniciante ) {
            System.out.println("============ Dr. Fernanda Montenegro =========================");
            System.out.println("Dieta: 3 refeições e 2 lanches, refeições simples e equilibradas.");

        } else if (a.getObjetivo() == Objetivo.Manutenção && a.getExp() == Categoria.Intermediario) {
            System.out.println("============ Dr. João Vitor =========================");
            System.out.println("Dieta: controle moderado de carbo, frango + arroz integral.");

        } else if (a.getObjetivo() == Objetivo.Manutenção && a.getExp() == Categoria.Avançado) {
            System.out.println("============ Dr. Felipe Ret =========================");
            System.out.println("Dieta: estabilidade calórica, ovos + aveia, proteína em todas refeições.");

        } else if (a.getObjetivo() == Objetivo.PerderPeso && a.getExp() == Categoria.Iniciante) {
            System.out.println("============ Dr. Fernanda Montenegro =========================");
            System.out.println("Dieta: reduzir processados, salada + frango, sopa à noite.");

        } else if (a.getObjetivo() == Objetivo.PerderPeso && a.getExp() == Categoria.Intermediario) {
            System.out.println("============ Dr. João Vitor =========================");
            System.out.println("Dieta: refeições leves com proteína, castanhas no lanche.");

        } else if (a.getObjetivo() == Objetivo.PerderPeso && a.getExp() == Categoria.Avançado) {
            System.out.println("============ Dr. Felipe Ret =========================");
            System.out.println("Dieta: carbo muito controlado, omelete, salada e frango.");
        }
    }


}
