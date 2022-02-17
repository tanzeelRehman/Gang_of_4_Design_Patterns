package Mids.Mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl("Maryam",mediator);
        User user2 = new UserImpl("Ahmed",mediator);
        User user3 = new UserImpl("Zeshan",mediator);
        mediator.addUser(user1);
        mediator.addUser(user2);

        user1.send("Hi to all");
    }
}
