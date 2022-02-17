package Strategy;

public class CreditCardStratgey implements PaymentStrategy {
    private String name;
    private double cardNo;
    private double cardPIN;
    private double dateofExpiry;

    public CreditCardStratgey(String name, double cardNo, double cardPIN, double dateofExpiry) {
        this.name = name;
        this.cardNo = cardNo;
        this.cardPIN = cardPIN;
        this.dateofExpiry = dateofExpiry;
    }




    @Override
    public void pay(double amount) {
        System.out.println(amount + " Paid using CreditCard");
    }
}
