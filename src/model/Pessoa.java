package model;

import enums.Genero;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;
    protected Genero genero;
    protected double altura;

    public Pessoa(String nome, String cpf, int idade, Genero genero) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
    }

    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
