
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cliente, informe seu nome: ");
        String clientName = scan.next();

        System.out.println("Informe o número da conta: ");
        int account = scan.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String branch = scan.next();

        System.out.println("Informe o seu saldo: ");
        double balance = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, ", clientName);
        System.out.printf("sua agência é %s, conta %d e seu saldo %.2f ", branch, account, balance);
        System.out.println("já está disponível para saque.");
        
        scan.close();
    }
}