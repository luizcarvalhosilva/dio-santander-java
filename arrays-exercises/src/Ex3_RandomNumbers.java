
import java.util.Random;

public class Ex3_RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int[] randomNumbers = new int[20];

        for (int i = 0; i < randomNumbers.length; i++) {
            int number = random.nextInt(100);
            randomNumbers[i] = number;
        }

        System.out.println("Os números aleatórios são: ");
        for (int randomNumber : randomNumbers) {
            System.out.print(randomNumber + " ");
        }

        System.out.println("\nOs sucessores são: ");
        for (int randomNumber : randomNumbers) {
            System.out.print(randomNumber + 1 + " ");
        }

        System.out.println("\nOs antecessores são: ");
        for (int randomNumber : randomNumbers) {
            System.out.print(randomNumber - 1 + " ");
        }
    }
}