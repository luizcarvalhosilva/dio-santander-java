package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String title;
    private String descricao;
    private LocalDate date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria [title=" + title + ", descricao=" + descricao + ", date=" + date + "]";
    }

}
