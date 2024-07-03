package com.gerentes;

import com.gerentes.dao.DiciplinaPojo;
import com.gerentes.dao.DiciplinaDao;
import com.gerentes.modelo.Diciplina;

public class App {
    public static void main(String[] args)
    {   
        /*  
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

        /*
        DiciplinaPojo diciplinaPojo = new DiciplinaPojo();
        diciplinaPojo.setId(2);

        DiciplinaDao diciplinaDao = new DiciplinaDao();
        diciplinaDao.consultarDiciplina(diciplinaPojo);
        =========================================================================================*/
        
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




       // diciplinaPojo.setId(5);


    
    }

}
