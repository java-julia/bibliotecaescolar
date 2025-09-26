package br.com.senai.infoa.biblioteca.models;

import java.time.LocalDate;


public class Emprestimo {

    private int id;
    private Livro livro;
    private Aluno aluno;
    private Professor professor;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean livroEntregue; 

    public Emprestimo() {}

    public Emprestimo(int id, Livro livro, Aluno aluno, Professor professor, LocalDate dataEmprestimo, LocalDate dataDevolucao,
            boolean livroEntregue) {
        this.id = id;
        this.livro = livro;
        this.aluno = aluno;
        this.professor = professor;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.livroEntregue = livroEntregue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isLivroEntregue() {
        return livroEntregue;
    }

    public void setLivroEntregue(boolean livroEntregue) {
        this.livroEntregue = livroEntregue;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    


    
}
