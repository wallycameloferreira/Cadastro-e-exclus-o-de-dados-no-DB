package com.example.biblioteca.model;

import jakarta.persistence.*;

@Entity /*DIZ AO BANCO QUE FARÁ PERSISTENCIA NO DB*/
@Table(name = "livros") /*SETA O NOME DA TABELA DO BANCO*/
public class Livro {

    @Id /*INDICA A CHAVE PRIMARIA DA TABELA DO BANCO*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*DELEGA A RESPONSABILIDADE DE CRIAR PK AO BANCO*/
    private Long id;
    private String titulo;
    private String autor;
    private Integer ano;

    /*INICIO GETTER MANUAL*/
    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAno() {
        return ano;
    }
    /*FIM GETTER MANUAL*/

    /*INICIO SETTER MANUAL*/
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
    /*FIM SETTER MANUAL*/

    /*INICIO CONSTRUTOR VAZIO*/

    public Livro() {
    }

    /*FIM CONSTRUTOR VAZIO*/
}
