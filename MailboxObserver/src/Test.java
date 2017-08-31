
public class Test {

    public static void main(String[] args){

       MailBox mailBox1 = new MailBox();
       PostOffice office = new PostOffice("Manhattan");

       office.addObserver(mailBox1);
       office.newMail();

        System.out.println("---------------------");
        MailBox mailBox2 = new MailBox();
        office.addObserver(mailBox2);
        office.newMail();

        /

    }
}
