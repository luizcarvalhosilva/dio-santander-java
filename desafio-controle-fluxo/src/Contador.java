import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int param_1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int param_2 = terminal.nextInt();
        terminal.close();

        try {
            counter(param_1, param_2);
        } catch (InvalidParamsException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void counter(int param_1, int param_2) throws InvalidParamsException {

        if (param_1 >= param_2)
            throw new InvalidParamsException();

        int count = param_2 - param_1;
        for (int i = 1; i <= count; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}