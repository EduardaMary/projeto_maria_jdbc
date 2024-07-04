package com.gerentes;

import com.gerentes.dao.DiciplinaPojo;
import com.gerentes.dao.DiciplinaDao;

public class App {
    public static void main(String[] args)
    {   
        /*  CADASTRAR
        Diciplina diciplina = new Diciplina();
        diciplina.setNome("matematica");
        diciplina.setCargaHoraria(16);
        diciplina.setProfessor("marcos");

        DiciplinaPojo diciplinaPojo = new DiciplinaPojo();
        diciplinaPojo.setNome(diciplina.getNome());
        diciplinaPojo.setCargaHoraria(diciplina.getCargaHoraria());
        diciplinaPojo.setProfessor(diciplina.getProfessor());

        //Cadastra
        DiciplinaDao diciplinaDao = new DiciplinaDao();
        diciplinaDao.cadastrarDiciplina(diciplinaPojo);
        =========================================================================================*/

        /* CONSULTAR
        DiciplinaPojo diciplinaPojo = new DiciplinaPojo();
        diciplinaPojo.setId(2);

        DiciplinaDao diciplinaDao = new DiciplinaDao();
        diciplinaDao.consultarDiciplina(diciplinaPojo);
        =========================================================================================*/

        /* ALTERAR
        Diciplina diciplina = new Diciplina();
        diciplina.setNome("Back end");
        diciplina.setCargaHoraria(9);
        diciplina.setProfessor("guilerme");
        
        DiciplinaPojo diciplinaPojo = new DiciplinaPojo();
        diciplinaPojo.setNome(diciplina.getNome());
        diciplinaPojo.setCargaHoraria(diciplina.getCargaHoraria());
        diciplinaPojo.setProfessor(diciplina.getProfessor());

        diciplinaPojo.setId(1);
        

        DiciplinaDao diciplinaDao = new DiciplinaDao();
        diciplinaDao.Alterardiciplina(diciplinaPojo);
        =========================================================================================*/
      

        /* DELETAR */
        DiciplinaPojo diciplinaPojo = new DiciplinaPojo();
        diciplinaPojo.setId(2);

        DiciplinaDao diciplinaDao = new DiciplinaDao();
        diciplinaDao.deletardiciplina(diciplinaPojo);


       // diciplinaPojo.setId(5);
    }
}
