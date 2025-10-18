package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AverageTemperatureSemester {
    public static void main(String[] args) {
        List<Double> temperatures = new ArrayList<>();
        List<String> months = List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho");
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int count = 0;
        while (count < 6) {
            System.out.println("Temperatura média de " + months.get(count));
            Double temp = scan.nextDouble();
            temperatures.add(temp);
            count++;
        }

        System.out.println(temperatures);
    }
}
