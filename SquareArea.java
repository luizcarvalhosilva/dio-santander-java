
import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho do lado do quadrado em cm: ");
        var side = scanner.nextInt();
        System.out.printf("Um quadrado de lado %dcm, possui uma área de %dcm", side, side*side);
    }
}
