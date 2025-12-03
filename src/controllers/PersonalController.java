package controllers;

import model.Aluno;
import model.Pessoa;
import services.PersonalService;

public class PersonalController {
    PersonalService ps = new PersonalService();
    Pessoa a = new Aluno();

    public double calculoImc(double peso, double altura){
         return ps.calculoImc(peso,altura);
    }

    public void objetivo(double peso, double altura,Aluno a){
        ps.objetivo(peso,altura,a);
    }

    public void recomendacao(Aluno a){
        ps.recomendacao(a);
    }
}
