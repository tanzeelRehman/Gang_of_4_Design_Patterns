package Command;

public class commandDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Remote remote = new Remote(light);
        remote.pressOn();
        remote.pressOff();

        Fan fan = new Fan();
        remote.setDevice(fan);
        fan.on();
        fan.off();
    }
}
