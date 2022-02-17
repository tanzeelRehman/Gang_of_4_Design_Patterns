package MidsVisitor;

public class Manager extends Employee{
    Manager(String name, int code) {
        super(name);
        super.kpi= code;

    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getProducts(){
        return super.kpi;
    }
    private String name;

    private double product;



    public String getName() {
        return name;
    }




    public String toString() {
        return "Engineer{"+ "name = "+ name + '\'' + " , product ="+ product +'}';
    }

}
