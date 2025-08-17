import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitle("Java");
        curso1.setDescription("java, do básico ao intermediário");
        curso1.setCourseHours(8);

        Curso curso2 = new Curso();
        curso2.setTitle("Springboot");
        curso2.setDescription("springboot, do básico ao intermediário");
        curso2.setCourseHours(5);

        Mentoria mentorship = new Mentoria();
        mentorship.setTitle("Mentoria X");
        mentorship.setDescription("descricao X");
        mentorship.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer express");
        bootcamp.setDescription("Desenvolvimento em java.");
        bootcamp.getContents().add(curso1);
        bootcamp.getContents().add(curso2);
        bootcamp.getContents().add(mentorship);

        Dev devXico = new Dev();
        devXico.setName("Xico");
        devXico.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devXico.getSubscribedContents());
        devXico.advance();
        System.out.println("Conteúdos concluídos: " + devXico.getCompletedContents());
        System.out.println("XP: " + devXico.calculateTotalXp());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentorship);
    }
}
