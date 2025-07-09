import java.util.Scanner;

public class WhatYourName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Olá, informe seu nome ");
        String userName = scanner.next();
        System.out.print("Qual sua idade? ");
        int userAge = scanner.nextInt();
        System.out.printf("Olá, %s. Você tem %d anos.", userName, userAge);
    }
}
