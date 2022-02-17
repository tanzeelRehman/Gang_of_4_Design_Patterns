package Command;

public class TurnOnCommand implements Command{
    Device device;
    TurnOnCommand(Device device){
        this.device = device;
    }
    @Override
    public void execute( ) {
        device.on();
    }

    @Override
    public void undo() {
        System.out.println("Undoing...");
    }
}
