
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GreetingsMessage {

    public static String rightGreetings(LocalTime hour) {
        DateTimeFormatter fullTimeFormat = DateTimeFormatter.ofPattern("HH:mm");

        String greetings = "";
        if (hour.isBefore(LocalTime.of(5, 0))) {
            greetings += "Boa noite! ";
        } else if (hour.isBefore(LocalTime.NOON)) {
            greetings += "Bom dia! ";
        } else if (hour.isBefore(LocalTime.of(18, 0))) {
            greetings += "Boa tarde! ";
        } else {
            greetings += "Boa noite! ";
        }
        greetings += "Agora são " + hour.format(fullTimeFormat);

        return greetings;
    }

    public static void main(String[] args) {
        LocalTime actualTime = LocalTime.now();

        System.out.println(rightGreetings(actualTime));
    }
}