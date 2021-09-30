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

/*Starte nun beide Threads.
- Was fällt auf?
- Versuche das Phänomen zu erklären!
- Ändere nun dein Programm, sodass jeweils mehr Ausgaben je Thread erfolgen (200, 2000, 20000, ...) - was beobachtest du dabei?
 */

/*
Threads werden durchlaufen, bevor ein anderer an die Reihe kommt.
Wenn man das Programm ändert, fällt mir auf dass zwischen durch auch der andere Thread auftaucht.
 */