package br.com.senai.infoa.biblioteca.models;

public class Aluno {

    private int id;
    private String nomecompleto;
    private int matricula;
    private String email;
    private Boolean ativo;

    public Aluno() {}

    public Aluno(int id, String nomecompleto, int matricula, String email, Boolean ativo) {
        this.id = id;
        this.nomecompleto = nomecompleto;
        this.matricula = matricula;
        this.email = email;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    
    
}
