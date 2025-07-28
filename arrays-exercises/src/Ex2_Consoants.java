import java.util.Scanner;

public class Ex2_Consoants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoants = new String[6];
        int consoantsQuantity = 0;

        int count = 0;
        do {
            System.out.print("Letra: ");
            String letter = scan.next();

            if (!(letter.equalsIgnoreCase("a") ||
                    letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("i") ||
                    letter.equalsIgnoreCase("o") ||
                    letter.equalsIgnoreCase("u"))) {
                consoants[count] = letter;
                consoantsQuantity++;
            }
            count++;

        } while (count < consoants.length);

        System.out.print("As consoantes são: ");
        for (String consoant : consoants) {
            if (consoant != null) 
            System.out.print(consoant + " ");
        }
        System.out.println("Total de consoantes: " + consoantsQuantity);

        scan.close();
    }
}
