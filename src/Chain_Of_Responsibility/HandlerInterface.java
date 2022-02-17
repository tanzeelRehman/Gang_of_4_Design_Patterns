package Chain_Of_Responsibility;

public interface HandlerInterface {
    public void setNext(BaseHandler handler);
    public void handle(File file);
    public String getHandlerName();
}
