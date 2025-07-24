
import java.util.Scanner;

public class Ex4_EvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberQuantity, number;

        System.out.print("Defina a quantidade de números: ");
        numberQuantity = scanner.nextInt();

        int count = 0, evens = 0, odds = 0;
        do { 
            System.out.print("Número: ");
            number = scanner.nextInt();
            
            if (number % 2 == 0) evens++;
            else odds++;

            count++;
        } while (count < numberQuantity);
        
        System.out.println("Pares: " + evens);
        System.out.println("Ímpares: " + odds);
        scanner.close();
    }
}