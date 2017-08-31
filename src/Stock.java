import java.util.ArrayList;

public class Stock implements Subject {
    private ArrayList<Observer> observerArrayList;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public Stock(){
       observerArrayList = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observerArrayList.add(newObserver);

    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observerArrayList.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1)+ " deleted");
        observerArrayList.remove(observerIndex);

    }

    @Override
    public void notifyObserver() {
        for(Observer counter: observerArrayList){

            counter.update(ibmPrice,applPrice,googPrice);
        }
    }

  public void setIbmPrice(double newIbm){
        this.ibmPrice = newIbm;
        notifyObserver();
  }

  public void setApplPrice(double newAppl){
      this.applPrice = newAppl;
      notifyObserver();
  }

  public void setGoogPrice(double newGoog){
      this.googPrice = newGoog;
      notifyObserver();
  }



}

