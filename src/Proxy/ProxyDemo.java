package Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        InterfaceCommand ic = new ProxyCommand("root");
        ic.runCommand("rm folder bin");

        InterfaceCommand ic2 = new ProxyCommand("zelu");
        ic2.runCommand("rm folder bin");

    }

}
