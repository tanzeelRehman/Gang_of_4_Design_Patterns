package Proxy;

public class OrignalCommand implements InterfaceCommand {

    @Override
    public void runCommand(String input) {
        System.out.println("Executing Command '"+input+"' as a root user");
    }
}
