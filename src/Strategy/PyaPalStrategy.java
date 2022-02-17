package Strategy;

public class PyaPalStrategy implements PaymentStrategy{
    String emailId;

    public PyaPalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    String password;


    @Override
    public void pay(double amount) {
        System.out.println(amount + " Paid using PayPal");
    }
}
