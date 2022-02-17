package Command;

public class TurnOffCommand implements  Command {
    Device device;
    TurnOffCommand(Device device){
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
