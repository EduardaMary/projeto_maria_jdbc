package com.gerentes;

import com.gerentes.dao.PessoaDao;
import com.gerentes.dao.PessoaPojo;
import com.gerentes.modelo.Pessoa;

public class App {
    public static void main(String[] args)
    {     
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.setEndereco("Rua benjamim Constante, 715");
        pessoa.setIdade(18);

        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setNome(pessoa.getNome());
        pessoaPojo.setEndereco(pessoa.getEndereco());
        pessoaPojo.setIdade(pessoa.getIdade());

        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.cadastrarPessoa(pessoaPojo);

        System.out.println("Alteração no código");
    }

}
