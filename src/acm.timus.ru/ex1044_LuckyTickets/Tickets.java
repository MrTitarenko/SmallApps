
/*
 *      Задача
 * So you are to save public transport of our city. Write a program that determines
 * a number of lucky tickets for the given number of digits. By the way, there can’t
 * be more than nine digits on one ticket.
 *      Исходные данные
 * contains a positive even integer not greater than 9.
 *      Результат
 * should contain a number of tickets such that the sum of the first half of digits
 * is equal to the sum of the second half of digits.
 */
package acm.timus.ru.ex1044_LuckyTickets;

import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        int digits;
        int sum = 0;

        Scanner in = new Scanner(System.in);
        digits = in.nextInt();

        for (int i = 0; i < Math.pow(10, digits); i++) {
            int right = 0, left = 0;
            int ticket = i;
            for (int n = 0; n < digits / 2; n++) {
                right += ticket % 10;
                ticket /= 10;
            }
            for (int n = 0; n < digits / 2; n++) {
                left += ticket % 10;
                if (left > right) {
                    break;
                }
                ticket /= 10;
            }
            if (left == right) {
                sum++;
            }
        }
        System.out.print(sum);
    }
}
