
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);

    //trigger
    //which is notify any observer when new mail is received
    void NotifyObserver();

}
