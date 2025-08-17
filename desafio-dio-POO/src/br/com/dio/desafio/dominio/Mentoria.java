package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Content {

    private LocalDate date;

    @Override
    public double calculateXp() {

        return XP_DEFAULT + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria [title=" + getTitle() + ", descricao=" + getDescription() + ", date=" + date + "]";
    }

}
