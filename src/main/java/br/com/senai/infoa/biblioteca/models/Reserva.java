package br.com.senai.infoa.biblioteca.models;

import java.time.LocalDate;

public class Reserva {

    private String id;
    private Livro livro;
    private Aluno aluno;
    private Professor professor;
    private LocalDate dataReserva;
    private LocalDate dataExpiracao;

    public Reserva() {}

    public Reserva(String id, Livro livro, Aluno aluno, Professor professor, LocalDate dataReserva,
            LocalDate dataExpiracao) {
        this.id = id;
        this.livro = livro;
        this.aluno = aluno;
        this.professor = professor;
        this.dataReserva = dataReserva;
        this.dataExpiracao = dataExpiracao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    


    
}
