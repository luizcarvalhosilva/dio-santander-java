package br.com.dio.desafio.dominio;

public class Curso {
    private String title;
    private String descricao;
    private int courseHours;

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

    public int getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(int courseHours) {
        this.courseHours = courseHours;
    }

    @Override
    public String toString() {
        return "Curso [title=" + title + ", descricao=" + descricao + ", courseHours=" + courseHours + "]";
    }

}
