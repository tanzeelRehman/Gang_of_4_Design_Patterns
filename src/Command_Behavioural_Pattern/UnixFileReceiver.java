package Command_Behavioural_Pattern;

public class UnixFileReceiver implements  FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("File is open in Unix");
    }

    @Override
    public void closeFile() {
        System.out.println("File is closed in unix");
    }

    @Override
    public void writeFile() {
        System.out.println("File is written in unix");
    }
}
