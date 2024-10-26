package com.example.AvaliacaoSpring.dto;

import com.example.AvaliacaoSpring.model.Artigo;
import com.example.AvaliacaoSpring.model.Autor;
import com.example.AvaliacaoSpring.repository.RevistaRepository;

import java.util.List;

public class ArtigoInputDTO {

    private String titulo;
    private String ano;
    private String revista;
    private List<Autor> autores;

    public ArtigoInputDTO(){
    }

    //Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public String getRevista() {
        return revista;
    }

    public void setRevista(String revista) {
        this.revista = revista;
    }

    public Artigo build(RevistaRepository revistaRepository){
        Artigo artigo = new Artigo();
        artigo.setTitulo(this.titulo);
        artigo.setRevista(revistaRepository.findByNome(this.revista));
        return artigo;
    }
}