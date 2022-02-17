package Mediator;

public class Demo {
    public static void main(String[] args) {
        Component1 component1 = new Component1();
        Component2 component2 = new Component2();
        new ConcreteMediator(component1, component2);
        System.out.println("Client operation on A Triggers:");
        component1.doA();
        System.out.println("Client operation on B Triggers:");
        component1.doB();
    }
}
