/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1086
 *
 * Напишите программу, вычисляющую n-е по счёту простое число.
 *      Исходные данные
 * В первой строке находится ровно одно целое число k, задающее
 * количество чисел в списке. За ним следуют k целых чисел,
 * по одному в строке. Все числа положительные и не превосходят 15000.
 *      Результат
 * Для каждого числа n из списка вы должны вывести n-е по счёту простое число.
 * Ответ для каждого числа должен находиться в отдельной строке.
*/

package acm.timus.ru.ex1086_Cryptography;

import java.util.Scanner;

public class SimpleNumbers {
    public static void main(String[] args) {
        int n;
        int[] array;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        for (int pos : array) {
            int value = 1;
            int count = 0;
            while (count < pos) {
                boolean b = true;
                value++;
                for (int i = value; i > 1; i--) {
                    if (((value / i) > 1) & ((value % i) == 0)) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    count++;
                }
            }
            System.out.println(value);
        }
    }
}
