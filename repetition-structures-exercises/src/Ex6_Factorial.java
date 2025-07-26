
import java.util.Scanner;

public class Ex6_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número que deseja ver o fatorial: ");
        int factorial = scan.nextInt();

        System.out.print(factorial + "! = ");

        String expression = "";
        int multiplication = 1;
        for (int i = factorial; i >= 1; i--) {
            multiplication *= i;
            expression += i;
            if (i > 1) expression += " * ";
        }
        System.out.println(expression + " = " + multiplication);
        scan.close();
    }
}