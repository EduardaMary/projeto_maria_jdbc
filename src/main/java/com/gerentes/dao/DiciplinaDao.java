package com.gerentes.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gerentes.conexao.Conexao;

public class DiciplinaDao {

    public void cadastrarDiciplina(DiciplinaPojo diciplinaPojo) {

        Conexao conexao = new Conexao();

        String sql = "insert into diciplina(nome, cargahoraria, professor) value (?, ?, ?)";
        
        PreparedStatement ps = null;
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);
    
            ps.setString(1, diciplinaPojo.getNome());
            ps.setInt(2, diciplinaPojo.getCargaHoraria());
            ps.setString(3, diciplinaPojo.getProfessor());

            ps.execute();
            ps.close();

            System.out.println("Conexão com o banco bem sucedida!!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("");
        } 
    }

    public void consultarDiciplina(DiciplinaPojo diciplinaPojo) {

        Conexao conexao = new Conexao();

        String sql = "select * from diciplina where id = ?";

        PreparedStatement ps = null;

        ResultSet rs = null;
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, diciplinaPojo.getId());

            rs = ps.executeQuery();
            
            while (rs.next()) {                 
                
                diciplinaPojo.setNome(rs.getString(1));
                diciplinaPojo.setCargaHoraria(rs.getInt(2));
                diciplinaPojo.setProfessor(rs.getString(3));
                
            }

            ps.execute();
            ps.close();

            System.out.println("Conectou ao banco de dados!!");

            System.out.println(diciplinaPojo.toString());
            
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("");
        }    
    }


    public void Alterardiciplina(DiciplinaPojo diciplinaPojo) { 

        Conexao conexao = new Conexao();

        String sql = "UPDATE diciplina SET nome = ?, cargahoraria = ?, professor = ? WHERE ID = ?;";

        PreparedStatement ps = null;

       
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);

            ps.setString(1, diciplinaPojo.getNome());
            ps.setInt(2, diciplinaPojo.getCargaHoraria());
            ps.setString(3, diciplinaPojo.getProfessor());
            ps.setInt(4, diciplinaPojo.getId());
            
            ps.execute();
            ps.close();

            System.out.println("alterou com sucesso os dados!!");

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("");
        }
    }

    
    public void deletardiciplina(DiciplinaPojo diciplinaPojo) { 

        Conexao conexao = new Conexao();

        String sql = "DELETE FROM diciplina WHERE ID = ?";

        PreparedStatement ps = null;
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, diciplinaPojo.getId());
            
            ps.execute();
            ps.close();

            System.out.println("alterou com sucesso os dados!!");

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("");
        }
    }
}
