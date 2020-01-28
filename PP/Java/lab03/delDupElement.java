
/**
 * delDupElement
 */

import java.util.*;

public class delDupElement {

    public static void main(String[] args) {
        int[] array = new int[] { 1, 1, 2, 1, 2, 2, 3, 7, 3, 1 };
        int n = 0;

        // Arrays.sort(array);
        n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i] == array[i + 1]) {
                    array[j] = array[i];
                    n--;
                    j--;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.println(array[j]);
        }

    }
}