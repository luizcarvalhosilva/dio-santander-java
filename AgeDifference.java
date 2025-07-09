
import java.util.Scanner;

public class AgeDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual seu nome? ");
        var name1 = scanner.next();
        System.out.print("Qual sua idade? ");
        var age1 = scanner.nextInt();
        System.out.print("Qual o nome da outra pessoa? ");
        var name2 = scanner.next();
        System.out.print("Qual a idade dessa pessoa? ");
        var age2 = scanner.nextInt();
        var difference = age1 >= age2 ? age1 - age2 : age2 - age1;
        System.out.printf("A diferença de idade entre %s e %s é de %d ano(s).", name1, name2, difference);
    }
}
