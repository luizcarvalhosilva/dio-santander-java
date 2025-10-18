package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExercise {
    public static void main(String[] args) {
        List<String> randomNumbers = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        // System.out.println("Imprima todos os elementos dessa lista de String: ");
        // randomNumbers.forEach(System.out::println);

        // System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        // randomNumbers.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        // System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        // randomNumbers.stream().map(Integer::parseInt).collect(Collectors.toList());

        // System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        /* ESTA FORMA NÃO É O PADRÃO A SER USADO, AO INVÉS DISSO, DEVEMOS USAR A SEGUNDA FORMA
        randomNumbers.stream().map(Integer::parseInt).filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i % 2 == 0 && i > 2;
            }
        }).collect(Collectors.toList());
        */
        // SEGUNDA FORMA:
        // randomNumbers.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());

        // System.out.println("Mostre a média dos números: ");
        // randomNumbers.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        List<Integer> randomIntNumbers = randomNumbers.stream().map(Integer::parseInt).collect(Collectors.toList());

        // é um método List, ou seja, é capaz de alterar a lista
        randomIntNumbers.removeIf(i -> (i % 2 != 0));
    }
}
