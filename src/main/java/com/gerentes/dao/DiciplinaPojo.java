package com.gerentes.dao;

public class DiciplinaPojo {

    private int id;
    private String nome;
    private int CargaHoraria;
    private String professor;

    @Deprecated
    public DiciplinaPojo(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCargaHoraria() {
        return CargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
    @Override
    public String toString() {
        return "DiciplinaPojo [nome=" + nome + ", CargaHoraria=" + CargaHoraria + ", professor=" + professor + "]";
    }
}
