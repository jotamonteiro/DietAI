package model;

import enums.Categoria;

public class Nutricionista extends Pessoa {
    String crn;
    Categoria categoria;

    public Nutricionista(String nome, String crn, Categoria categoria, int cpf, int idade) {
        super(nome,cpf,idade);
        this.categoria = categoria;
        this.crn = crn;
    }
}
