/**
 * Print elements from array 'buff' that != 0.
 */

package SkipZeros;

public class Skipping {
    public static void main(String[] args) {
        int[] buff = new int[]{1, 0, 0, 0, 1, 1, 0, 1};
        int zero = 0;
        int len = 0;
        int start = 0;
        for (int i = 0; i < buff.length; i++) {
            if (buff[i] == 0) {
                if (len != 0) {
                    for (int n = start; n < (start + len); n++) {
                        System.out.print(buff[n] + " ");
                    }
                    len = 0;
                }
                zero++;
            }
            if (buff[i] != 0) {
                if (zero != 0) {
                    len = 0;
                    zero = 0;
                }
                start = i - len;
                len++;
                if (i == buff.length - 1) {
                    for (int n = start; n < (start + len); n++) {
                        System.out.print(buff[n] + " ");
                    }
                }
            }
        }
    }
}