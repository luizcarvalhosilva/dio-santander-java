package list.basicoperations.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(String name, Double price, int quantity) {
        items.add(new Item(name, price, quantity));
    }

    public void removeItem(String name) {
        items.removeIf(i -> i.getName().equalsIgnoreCase(name));
    }

    public double getTotalValue() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("Carrinho vazio!");
            return;
        }

        for (Item item : items) {
            System.out.println("Nome: " + item.getName() +
                    ", Preço: R$ " + item.getPrice() + 
                    ", Quantidade: " + item.getQuantity());
        }
    }

}
