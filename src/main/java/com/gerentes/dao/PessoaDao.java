package com.gerentes.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gerentes.conexao.Conexao;


public class PessoaDao {
    
    public void cadastrarPessoa(PessoaPojo pessoaPojo) {

        Conexao conexao = new Conexao();

        String sql = "insert into pessoa(nome, endereco, idade) value (?, ?, ?)";

        PreparedStatement ps = null;
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);
    
            ps.setString(1, pessoaPojo.getNome());
            ps.setString(2, pessoaPojo.getEndereco());
            ps.setInt(3, pessoaPojo.getIdade());

            ps.execute();
            ps.close();

            System.out.println("Conectou ao banco de dados!!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("");
        }
    } 
    


 
    public void consultarPessoa(PessoaPojo pessoaPojo) {

        Conexao conexao = new Conexao();

        String sql = "select * from professor where id = ?";

        PreparedStatement ps = null;
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);
    
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                @SuppressWarnings("deprecation")
                PessoaPojo pessoa = new PessoaPojo();
                pessoa.setIdade(rs.getInt(1));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setEndereco(rs.getString("endereco"));
                pessoa.setIdade(rs.getInt("idade"));
                pessoa.add(pessoa);
            }

            ps.execute();
            ps.close();

            System.out.println("Conectou ao banco de dados!!");
            
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("");
        }
        
    }

}