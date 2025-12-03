package controllers;

import model.Aluno;
import services.NutricionistaService;

public class NutricionistaController {
    NutricionistaService ns = new NutricionistaService();

    public void fazerDieta(Aluno a){
        ns.fazerDieta(a);
    }
}
