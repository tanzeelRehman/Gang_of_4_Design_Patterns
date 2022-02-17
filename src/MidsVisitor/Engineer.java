package MidsVisitor;

public class Engineer extends Employee{


    Engineer(String name, int code) {
        super(name);
        super.kpi= code;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }


    public String getName() {
        return name;
    }
    public double getCode() {
        return kpi;
    }



    public String toString() {
        return "Engineer{"+ "name = "+ name + '\'' + " , code ="+ kpi +'}';
    }



}
