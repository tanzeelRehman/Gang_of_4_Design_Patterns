package Mids.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users = new ArrayList<>();


    private User user;


    @Override
    public void sendMessage(String name, User user) {
        for (User chatuser:
             users) {
            if (!(chatuser.equals(user))){
                chatuser.receive(name);
            }
        }

    }
    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
