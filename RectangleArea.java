
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Abaixo insira os valores do retângulo.");
        System.out.print("Informe o tamanho da base em cm: ");
        var base = scanner.nextInt();
        System.out.print("Informe a altura em cm: ");
        var height = scanner.nextInt();
        System.out.printf("A área do retângulo é %dcm.", base * height);
    }
}
