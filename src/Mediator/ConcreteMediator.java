package Mediator;

public class ConcreteMediator implements Mediator{
    private Component1 component1;
    private Component2 component2;

    public ConcreteMediator(Component1 component1, Component2 component2) {
        this.component1 = component1;
        component1.setMediator(this);
        this.component2 = component2;
        component2.setMediator(this);
    }

    @Override
    public void notify(Object sender, String event) {
        if (event.equals("A")) {
            System.out.println("Mediator Reacts on A and triggers following Operations : ");
            component2.doC();
        }
        if (event.equals("B")) {
            System.out.println("Mediator Reacts on B and triggers following Operations : ");
            component2.doD();
            component2.doC();
        }
    }
}
