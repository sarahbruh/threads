/**
 * uebung 1
 * @author Brunmayr Sarah
 * @version 12.0.1, 30.09.2021
 */

public class Main {
    public static void main(String[] args) {
        DatePrinter datePrinter = new DatePrinter();
        Thread t1 = new Thread(datePrinter);

        CountPrinter countPrinter = new CountPrinter();
        Thread t2 = new Thread( countPrinter);

        t1.start();
        t2.start();
    }
}
