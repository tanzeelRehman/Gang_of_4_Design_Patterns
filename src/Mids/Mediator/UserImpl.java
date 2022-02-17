package Mids.Mediator;

public class UserImpl extends User{
    UserImpl(String name, ChatMediator mediator) {
        super(name, mediator);

    }

    @Override
    public void send(String name) {
        getMediator().sendMessage(name,this);

    }

    @Override
    public void receive(String name) {
        System.out.println("Message is received from"+this.getName());
    }
}
