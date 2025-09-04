import java.util.Scanner;

public class Quadrilateral {

    // Área do quadrado: lado * lado
    public static double calcularArea(double lado) {
        return lado * lado;
    }

    // Área do retângulo: base * altura
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    // Área do trapézio: ((baseMaior + baseMenor) * altura) / 2
    public static double calcularArea(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    // Área do losango: (diagonalMaior * diagonalMenor) / 2
    public static double calcularArea(float diagonalMaior, float diagonalMenor) {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha a figura para calcular a área:");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Trapézio");
        System.out.println("4 - Losango");
        System.out.print("Opção: ");
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Informe o lado do quadrado: ");
                double lado = scan.nextDouble();
                System.out.println("Área do quadrado: " + calcularArea(lado));
                break;

            case 2:
                System.out.print("Informe a base do retângulo: ");
                double base = scan.nextDouble();
                System.out.print("Informe a altura do retângulo: ");
                double altura = scan.nextDouble();
                System.out.println("Área do retângulo: " + calcularArea(base, altura));
                break;

            case 3:
                System.out.print("Informe a base maior do trapézio: ");
                double baseMaior = scan.nextDouble();
                System.out.print("Informe a base menor do trapézio: ");
                double baseMenor = scan.nextDouble();
                System.out.print("Informe a altura do trapézio: ");
                double alturaT = scan.nextDouble();
                System.out.println("Área do trapézio: " + calcularArea(baseMaior, baseMenor, alturaT));
                break;

            case 4:
                System.out.print("Informe a diagonal maior do losango: ");
                float diagMaior = scan.nextFloat();
                System.out.print("Informe a diagonal menor do losango: ");
                float diagMenor = scan.nextFloat();
                System.out.println("Área do losango: " + calcularArea(diagMaior, diagMenor));
                break;

            default:
                System.out.println("Opção inválida.");
        }

        scan.close();
    }
}