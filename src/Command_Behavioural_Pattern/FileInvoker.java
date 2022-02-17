package Command_Behavioural_Pattern;

public class FileInvoker {
    public FileInvoker(Command command) {
        this.command = command;
    }

    Command command;
   public void executeCOmmand(){
        command.execute();
    }

}
