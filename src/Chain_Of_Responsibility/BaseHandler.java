package Chain_Of_Responsibility;

public abstract class BaseHandler implements HandlerInterface {
    HandlerInterface next;

    @Override
    public void setNext(BaseHandler handler) {
        this.next = handler;
    }
}
