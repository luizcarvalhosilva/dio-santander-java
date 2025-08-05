
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cliente, informe seu nome: ");
        String clientName = scan.nextLine();

        System.out.println("Informe o número da conta: ");
        int account = scan.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String branch = scan.next();

        System.out.println("Informe o seu saldo: ");
        double balance = scan.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                clientName, branch, account, balance
        );
        scan.close();
    }
}