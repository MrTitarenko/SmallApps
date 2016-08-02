/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1319
 *
 *      Исходные данные
 * Целое число N (1 ≤ N ≤ 100) – размер таблички.
 *      Результат
 * Табличка, помеченная цифрами, как она будет стоять в мастерской.
 * Номер один должен находиться в правом верхнем углу, далее ячейки нумеруются
 * по диагоналям сверху вниз, последний номер (N*N) стоит в левом нижнем углу.
 *
*/
package acm.timus.ru.ex1319_Hotel;

import java.util.Scanner;

/**
 * Was solved   12.04.2016
 */
public class OrderingArray {
    public static void main(String[] args) {
        int value = 1;
        int n;
        int[][] array;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        array = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            value = setValueToArray(value, array, 0, i);
        }

        for (int i = 1; i <= array.length; i++) {
            value = setValueToArray(value, array, i, 0);
        }

        for (int x[] : array) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    private static int setValueToArray(int value, int[][] array, int k, int n) {
        while (true) {
            try {
                array[k][n] = value;
                k++;
                n++;
                value++;
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
        return value;
    }
}
