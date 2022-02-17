package Mediator;

public  abstract class BaseComponent {
    protected  Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
