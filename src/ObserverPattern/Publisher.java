package ObserverPattern;

public interface Publisher {
    public void suscribe(Suscriber sus);
    public void unsuscribe(Suscriber sus);
    public void notifySuscribe();
}
