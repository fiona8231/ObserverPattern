
public class Test {
    public static void main(String[] args){

       Stock stockGrabber = new Stock();
       StockObserver observer1 = new StockObserver(stockGrabber);

       stockGrabber.setIbmPrice(188.00);
       stockGrabber.setApplPrice(200.00);
       stockGrabber.setGoogPrice(300.00);

       StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(188.00);
        stockGrabber.setApplPrice(200.00);
        stockGrabber.setGoogPrice(300.00);

        stockGrabber.unregister(observer1);

        stockGrabber.setIbmPrice(188.00);
        stockGrabber.setApplPrice(200.00);
        stockGrabber.setGoogPrice(300.00);

        // --------Thread Run------------

        Runnable getIBM = new ThreadStock(stockGrabber, 2, "IBM", 188.00);
        Runnable getAPPL = new ThreadStock(stockGrabber, 2, "APPL", 200.00);
        Runnable getGOOG= new ThreadStock(stockGrabber, 2, "GOOG", 300.00);

        new Thread(getIBM).start();
        new Thread(getAPPL).start();
        new Thread(getGOOG).start();


    }
}
