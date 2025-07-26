
import java.util.Scanner;

public class Ex5_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        do { 
            System.out.print("Informe qual tabuada deseja (apenas entre 1 e 10): ");
            number = scan.nextInt();
        } while (number < 1 || number > 10);
        
        for (int i = 1; i <= 10; i++) {
            int multiplication = number * i;
            System.out.println(number + " x " + i + " = " + multiplication);
        }
    }
}