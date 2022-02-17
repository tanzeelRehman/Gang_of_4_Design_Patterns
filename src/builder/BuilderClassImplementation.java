package builder;

public class BuilderClassImplementation {
    public static void main(String[] args) {
        Customer customer = new Customer.CustomerBuilder()
                .setName("Omkar Kulkarni")
                .setFirstName("Omkar")
                .setLastName("Kulkarni")
                .setMobileNumber("8551223****")
                .build();

        System.out.println(customer);
    }
}
