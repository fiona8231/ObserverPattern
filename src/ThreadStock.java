import java.text.DecimalFormat;

public class ThreadStock implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private Stock stockGrabber;

    public ThreadStock(Stock newStockGrabber, int newStarttime, String newStock, double newPrice) {

        this.stockGrabber = newStockGrabber;
        startTime = newStarttime;
        stock = newStock;
        price = newPrice;
    }


    @Override
    public void run() {

        for (int i = 1; i <= 20; i++) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            double ranNum = (Math.random() * (.06)) - .03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format(price + ranNum));

            if (stock == "IBM") stockGrabber.setIbmPrice(price);

            if (stock == "APPL") stockGrabber.setApplPrice(price);
            if (stock == "GOOG") stockGrabber.setGoogPrice(price);

            System.out.println(stock+ " :" + df.format(price) + " " + df.format(ranNum));
            System.out.println();


        }
    }
}