package Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    private List<Item> items = new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }
    private double  calculateAmount(){
        double amount =0;
        for (Item i: items){
            amount +=i.getPrice();
        }
        return amount;
    }
    public void setPaymentStrategy(PaymentStrategy strategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void checkOut(){
        double amount = calculateAmount();
        paymentStrategy.pay(amount);
    }
}
