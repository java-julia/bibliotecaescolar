package br.com.senai.infoa.biblioteca.models;

public class Professor {

    private int id;
    private String nomecompleto;
    private int matricula;
    private String departamento;
    private String titulacao;
    private Boolean ativo;

    public Professor() {}

    public Professor(int id, String nomecompleto, int matricula, String departamento, String titulacao, Boolean ativo) {
        this.id = id;
        this.nomecompleto = nomecompleto;
        this.matricula = matricula;
        this.departamento = departamento;
        this.titulacao = titulacao;
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    
    
}
