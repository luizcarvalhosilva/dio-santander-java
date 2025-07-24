
import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.
*/

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;

        System.out.println("Digite um número entre 0 e 10:");
        grade = scanner.nextInt();

        while (grade < 0 || grade > 10) {
            System.out.println("Número Inválido! Digite um valor entre 0 e 10:");
            grade = scanner.nextInt();
        }

        switch (grade) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Nota registrada: " + grade);
                break;
        }

        scanner.close();
    }
}