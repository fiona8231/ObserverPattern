
public interface Subject {
    //Handling all the adding deleting and updating all the observers

    public void register(Observer o);
    public void unregister(Observer o);
    public  void notifyObserver();


}