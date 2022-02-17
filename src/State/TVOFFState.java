package State;

public class TVOFFState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is OFF");
    }
}
