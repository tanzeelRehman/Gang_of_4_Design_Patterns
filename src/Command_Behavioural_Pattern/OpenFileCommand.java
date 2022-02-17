package Command_Behavioural_Pattern;

public class OpenFileCommand implements Command {
    public OpenFileCommand(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }

    FileSystemReceiver receiver;

    @Override
    public void execute() {
        receiver.openFile();
    }
}
