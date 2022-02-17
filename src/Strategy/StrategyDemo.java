package Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Item 1",2300);
        Item item2 = new Item("Item 2",2500);
        Item item3 = new Item("Item 2",2900);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.setPaymentStrategy(new PyaPalStrategy("paypalemail","pass"));
        cart.checkOut();

        cart.setPaymentStrategy(new CreditCardStratgey("zelu",123,234,2344));
        cart.checkOut();

    }


}
