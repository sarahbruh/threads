import java.util.Date;

/**
 * uebung 1
 * @author Brunmayr Sarah
 * @version 12.0.1, 30.09.2021
 */

public class DatePrinter implements Runnable{
    Date date = new Date();

    @Override
    public void run(){
        for (int i=0; i<=20; i++){
            System.out.println(date);
        }
    }
}
