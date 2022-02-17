package Command_Behavioural_Pattern;

public class CloseFileCommand implements Command{
    public CloseFileCommand(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }

    FileSystemReceiver receiver;

    @Override
    public void execute() {
        receiver.closeFile();
    }
}
