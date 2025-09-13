package list.basicoperations.shoppingcart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart();

        cart1.addItem("fonte XY 700w gold", 250.75, 1);
        cart1.addItem("CPU u-800f/n", 300.99, 1);
        cart1.addItem("monitor zaf-100", 170.0, 2);
        cart1.showItems();
        System.out.println("O valor do carrinho é R$ " + cart1.getTotalValue());

        cart1.removeItem("fonte XY 700w gold");
        cart1.showItems();
        System.out.println("O valor do carrinho é R$ " + cart1.getTotalValue());
    }
}
