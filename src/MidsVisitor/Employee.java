package MidsVisitor;

public abstract class Employee {
    String name;
    int kpi;
    Employee(String name){
        this.name = name;

    }

    public abstract void accept(IVisitor visitor);
}
