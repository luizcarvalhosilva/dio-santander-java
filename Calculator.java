
import java.util.Scanner;

public class Calculator {
    public static double sum(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double number1 = scan.nextDouble();

        System.out.print("Informe o segundo número: ");
        double number2 = scan.nextDouble();
        
        System.out.print("Informe qual operação deseja realizar (sum, min, times, div, all): ");
        String userOption = scan.next().toLowerCase();

        switch (userOption) {
            case "sum":
                System.out.print("O resultado é: " + sum(number1, number2));
                break;
            case "min":
                System.out.print("O resultado é: " + subtract(number1, number2));
                break;
            case "times":
                System.out.print("O resultado é: " + multiply(number1, number2));
                break;
            case "div":
                System.out.print("O resultado é: " + divide(number1, number2));
                break;
            case "all":
                System.out.println("A soma vale: " + sum(number1, number2));
                System.out.println("A diferença vale: " + subtract(number1, number2));
                System.out.println("A multiplicação vale: " + multiply(number1, number2));
                System.out.println("A divisão vale: " + divide(number1, number2));
                break;
            default:
                System.out.println("Opção inválida!");
        }
        scan.close();
    }
}