import java.util.ArrayList;

public class PostOffice implements Subject {

    private String Address;

    private ArrayList<Observer> observers;

    public  PostOffice(String newAddress){
        this.Address = newAddress;
        observers = new ArrayList<>();

    }

    public void newMail(){
        NotifyObserver();
    }


    @Override
    public void addObserver(Observer o) {

        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }

    @Override
    public void NotifyObserver() {

        for(int i=0; i< observers.size(); i++){
            observers.get(i).Update();

        }

    }
}
