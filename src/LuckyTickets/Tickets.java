/*
 * Every time when you ride in tram, you've got a ticket.
 * This ticket has a number of 6 units. Some people belive,
 * that tickets what have the same amount of first and
 * second three units are lucky.
 * How many of them?
 */

package LuckyTickets;

public class Tickets {
    public static void main(String[] args) {
        int a, b, c, t, v, w;
        float n = 0;
        for (int x = 1; x < 1000000; x++) {
            a = x / 100000;
            b = x / 10000 % 10;
            c = x / 1000 % 10;
            t = x % 1000 / 100;
            v = x % 100 / 10;
            w = x % 10;
            if (a + b + c == t + v + w) n++;
        }
        System.out.print(n * 100 / 999999 + "%");       //Show in percents quantity of "Lucky tickets"
    }
}
