package Proxy;

public class ProxyCommand implements InterfaceCommand{
    private  Boolean isRootUser= false;
    private  OrignalCommand orignalCommand;

    ProxyCommand(String username){
        if (username.equalsIgnoreCase("root")){
            isRootUser = true;
        }

    }

    public  void runCommand(String input){
        if (isRootUser){
            System.out.println("here");
            orignalCommand = new OrignalCommand();
            orignalCommand.runCommand(input);
        } else {
            System.out.println("You don't have adminstrator privillages:  Executing Command '"+input+"' as a guest user");
        }
    }
}
