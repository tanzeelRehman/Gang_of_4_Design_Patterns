package PrototypeWithSingleton;



public class Printer {
     private static  Printer instance;
     private  String name;

    public String getName() {
        return name;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    private  String ipaddress;

    private Printer(String name, String ipaddress) {
        this.name = name;
        this.ipaddress = ipaddress;
    }
    private Printer(Printer printer){
        this.name = printer.name;
        this.ipaddress = printer.ipaddress;
    }
    public static Printer getInstance() {

        return instance = new Printer("printer1", "172.0.0.0");
    }
    protected Printer clone() {
        return new Printer(this);
    }
    public boolean equals(Object obj) {
        if(!(obj instanceof Printer))
            return false;
        Printer printer2 =(Printer) obj;
        String name2= printer2.getName();
        String ip2= printer2.getIpaddress();
        if(name2.equals(this.name) && ip2.equals(this.ipaddress))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", ipaddress='" + ipaddress + '\'' +
                '}';
    }
}
