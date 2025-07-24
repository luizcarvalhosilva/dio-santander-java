
import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe 
o maior número e a média desses números.
*/

public class Ex3_GreaterAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        int sum = 0;
        int count = 0;
        int greater = Integer.MIN_VALUE;

        do {
            System.out.print("Número: ");
            number = scanner.nextInt();
            if (greater < number) greater = number;
            sum += number;
            count++;
        } while (count < 5);

        int average = sum / 5;

        System.out.println("A soma vale: " + sum);
        System.out.println("A média vale: " + average);
        System.out.println("O maior número é: " + greater);
    }
}