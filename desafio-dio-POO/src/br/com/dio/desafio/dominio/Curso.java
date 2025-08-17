package br.com.dio.desafio.dominio;

public class Curso extends Content {

    @Override
    public double calculateXp() {
        return XP_DEFAULT * courseHours;
    }

    private int courseHours;

    public int getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(int courseHours) {
        this.courseHours = courseHours;
    }

    @Override
    public String toString() {
        return "Curso [title=" + getTitle() + ", descricao=" + getDescription() + ", courseHours=" + courseHours + "]";
    }

}
