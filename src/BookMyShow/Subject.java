package BookMyShow;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyUsers(String msg);
}
