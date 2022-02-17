package Command;

public class Fan implements Device{
    @Override
    public void on() {
        System.out.println("Fan is On");
    }

    @Override
    public void off() {
        System.out.println("Fan is off");
    }
}
