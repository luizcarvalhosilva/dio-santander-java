
import java.util.Scanner;

public class bitwiseOperator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        var value1 = Integer.parseInt(scanner.next());
        System.out.print("Informe o segundo valor: ");
        var value2 = Integer.parseInt(scanner.next());
        var binVal1 = numToBit(value1);
        var binVal2 = numToBit(value2);
        System.out.printf("Dado o valor %s, temos que seu valor binário é %s \n", value1, binVal1);
        System.out.printf("Dado o valor %s, temos que seu valor binário é %s", value2, binVal2);
        System.out.println("\n Os resultados com bitwise serão");

        System.out.printf("%d & %d = %d \n", value1, value2, value1 & value2);
        System.out.printf("%d | %d = %d \n", value1, value2, value1 | value2);
        System.out.printf("%d ^ %d = %d \n", value1, value2, value1 ^ value2);
        System.out.printf("~%d = %d \n", value1, ~value1);
        System.out.printf("%d << %d = %d \n", value1, value2, value1 << value2);
        System.out.printf("%d >> %d = %d \n", value1, value2, value1 >> value2);
        System.out.printf("%d >>> %d = %d \n", value1, value2, value1 >>> value2);
        // System.out.printf("%d", Integer.MAX_VALUE);
        // System.out.printf("%s", Integer.toBinaryString((Integer.MAX_VALUE)));
    }

    public static String numToBit(int number) {
        var binary = Integer.toBinaryString(number);
        return binary;
    }
}
