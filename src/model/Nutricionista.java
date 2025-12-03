package model;

import enums.Categoria;
import enums.Genero;

public class Nutricionista extends Pessoa {
    private String crn;
    private Categoria categoria;

    public Nutricionista(String nome, String crn, Categoria categoria, String cpf, int idade, Genero genero) {
        super(nome, cpf, idade, genero);
        this.categoria = categoria;
        this.crn = crn;
    }

    @Override
    public String toString() {
        return "========== Dados do Personal ==========\n" +
                "Nome:" + nome +
                "\n Idade:" + idade +
                "\n Experiencia:" + categoria +
                "\n Crn:" + crn;
    }
}
