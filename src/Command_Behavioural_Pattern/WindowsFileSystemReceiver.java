package Command_Behavioural_Pattern;

public class WindowsFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile() {
        System.out.println("File is open in windows");
    }

    @Override
    public void closeFile() {
        System.out.println("File is closed in windows");
    }

    @Override
    public void writeFile() {
        System.out.println("File is written in windows");
    }
}
