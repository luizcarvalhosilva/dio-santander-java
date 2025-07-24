
import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Ex1_NameAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Informe seu nome: ");
            String name = scanner.next();

            if (!name.equals("0")) {
               System.out.print("Informe sua idade: "); 
               int age = scanner.nextInt();
            } else {
                break;
            }
            
        } while (true);

        scanner.close();
    }
}