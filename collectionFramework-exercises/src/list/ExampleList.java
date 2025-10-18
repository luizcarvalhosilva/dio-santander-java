package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) throws Exception {
        // List notas = new ArrayList<>();
        // List<Double> notas = new ArrayList<>();
        // ArrayList<Double> notas = new ArrayList<>();
        // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3));
        // List<Double> notas = Arrays.asList(7d, 8.5, 9.3);
        // List<Double> notas = List.of(7d, 8.5, 9.3);
        System.out.println("Crie uma lista e adicione sete notas.");
        List<Double> notas = new ArrayList<Double>();

        // Como adicionar elementos
        notas.add(7.5);
        notas.add(8.0);
        notas.add(6.3);
        notas.add(5.0);
        notas.add(8.5);
        notas.add(8.0);
        notas.add(7.5);
        System.out.println(notas.toString());

        // Como exibir a posição de um elemento
        notas.indexOf(5.0); // retorna a posição do elemento na lista

        // Adicionando elemento na posição específica
        notas.add(4, 8d); // (index,element)
        System.out.println(notas.toString());

        // Substituindo um elemento por outro
        notas.set(5, 3d); // (index,element)
        System.out.println(notas.toString());

        // Mostrando elemento de uma posição x
        System.out.println(notas.get(2)); // devolve o número 6.3

        // Exibir o menor valor de um array
        System.out.println(Collections.min(notas));

        // Exibir o menor valor de um array
        System.out.println(Collections.max(notas));

        // Utilizando o método "Iterator" para somar o array
        Iterator<Double> iterator = notas.iterator();
        Double sum = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            sum += next;
        }

        // size() para saber o tamano do array
        System.out.println(notas.size());

        notas.remove(8d);
        System.out.println(notas.toString());

        // contains()
        System.out.println(notas.contains(6.3));

        // remover os valores menores que 8 e depois mostrar o array
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 8)
                iterator1.remove();
        }
        System.out.println(notas.toString());

        // apagando a lista
        notas.clear();

        notas.isEmpty();
    }
}
