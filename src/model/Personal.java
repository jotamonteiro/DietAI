package model;


import enums.Categoria;
import enums.Genero;

public class Personal extends Pessoa {
    private String crefi;
    private Categoria categoria;

    public Personal (String nome, String cpf,int idade, Genero genero, Categoria categoria,String crefi){
        super(nome,cpf,idade,genero);
        this.crefi = crefi;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "========== Dados do Personal ==========\n" +
                "Nome:" + nome +
                "\n Idade:" + idade +
                "\n Experiencia:" + categoria +
                "\n Crefi:" + crefi;
    }
}
