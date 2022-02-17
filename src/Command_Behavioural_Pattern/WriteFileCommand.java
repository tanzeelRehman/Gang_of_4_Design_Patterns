package Command_Behavioural_Pattern;

public class WriteFileCommand implements Command{
    public WriteFileCommand(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }

    FileSystemReceiver receiver;

    @Override
    public void execute() {
        receiver.writeFile();
    }
}
