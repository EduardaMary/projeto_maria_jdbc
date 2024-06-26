package com.gerentes.dao;

import com.gerentes.modelo.Pessoa;

public class PessoaPojo {
    private String nome;
    private String endereco;
    private int idade;

    @Deprecated
    public PessoaPojo(){
    }
    
    public PessoaPojo(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa add(PessoaPojo pessoaPojo) {
       Pessoa pessoa = new Pessoa(pessoaPojo.getNome(), pessoaPojo.getEndereco(), pessoaPojo.getIdade() );
       return pessoa;
    }
}
