/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1025
 *
 * ...Пусть, например, на острове были сформированы три группы избирателей,
 * численностью в 5, 5 и 7 человек соответственно. Тогда партии достаточно
 * иметь трех сторонников в каждой из первых двух групп, и она сможет провести
 * решение всего шестью голосами «за», вместо девяти, необходимых при общем голосовании.
 *      Задача
 * Вам надо написать программу, которая определяет по заданному разбиению избирателей
 * на группы минимальное количество сторонников партии, достаточное, при некотором
 * распределении их по группам, для принятия любого решения.
 *      Исходные данные
 * В первой строке записано нечётное число K — количество групп избирателей (1 ≤ K ≤ 101).
 * Во второй строке через пробел записаны K нечётных чисел, которые задают количество
 * избирателей в группах. Население острова не превосходит 9999 человек.
 *      Результат
 * Выведите минимальное количество сторонников партии, способное решить исход голосования.
 */

package acm.timus.ru.ex1025_Democracy_in_Danger;

import java.util.Scanner;

/**
 * Was solved   13.04.2016
 */
public class Voting {
    public static void main(String[] args) {
        int minVoters = 0;
        int groups;
        int[] voters;

        Scanner in = new Scanner(System.in);
        groups = in.nextInt();
        voters = new int[groups];
        for (int i = 0; i < voters.length; i++) {
            voters[i] = in.nextInt();
        }
        sortMinMax(voters);

        for (int i = 0; i < ((groups + 1) / 2); i++) {
            if ((voters[i] % 2) == 0) {
                minVoters += voters[i] / 2 + 1;
            } else {
                minVoters += (voters[i] + 1) / 2;
            }
        }
        System.out.print(minVoters);
    }

    /**
     * Sorting groups in array 'voters' by the quantity of electors from min to max
     */
    private static void sortMinMax(int[] voters) {
        for (int k = 0; k < voters.length - 1; k++) {
            for (int m = 0; m < voters.length - 1; m++) {
                if (voters[m] > voters[m + 1]) {
                    int temp = voters[m];
                    voters[m] = voters[m + 1];
                    voters[m + 1] = temp;
                }
            }
        }
    }
}
