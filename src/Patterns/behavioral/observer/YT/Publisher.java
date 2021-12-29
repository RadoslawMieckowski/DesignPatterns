package Patterns.behavioral.observer.YT;

public interface Publisher {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
