package Mids.Mediator;

public abstract class User {
    String name;
    ChatMediator mediator;

    public String getName() {
        return name;
    }

    public ChatMediator getMediator() {
        return mediator;
    }

    User(String name, ChatMediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

      public abstract void send(String name);
      public abstract void receive(String name);


}
