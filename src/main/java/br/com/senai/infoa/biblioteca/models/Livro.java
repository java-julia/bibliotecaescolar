package br.com.senai.infoa.biblioteca.models;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private GeneroLivro GeneroLivro;

    public Livro() {}

    public Livro(int id, String titulo, String autor, String editora,
            br.com.senai.infoa.biblioteca.models.GeneroLivro generoLivro) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        GeneroLivro = generoLivro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public GeneroLivro getGeneroLivro() {
        return GeneroLivro;
    }

    public void setGeneroLivro(GeneroLivro generoLivro) {
        GeneroLivro = generoLivro;
    }

    
    
}
