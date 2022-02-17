package Command_Behavioural_Pattern;

public class CommandDemo {
    public static void main(String[] args) {
        FileSystemReceiver receiver;
        String osname = System.getProperty("os.name").toLowerCase();
        System.out.println(osname);
        if(osname.contains("windows")){
            receiver = new WindowsFileSystemReceiver();
        }
        else {
            receiver = new UnixFileReceiver();
        }
        Command openfilecommand = new OpenFileCommand(receiver);
        FileInvoker invoker = new FileInvoker(openfilecommand);
        invoker.executeCOmmand();
    }
}
