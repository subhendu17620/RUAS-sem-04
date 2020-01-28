import java.util.*;

public class dupElement {
    public static void main(final String[] args) {

        int[] array = new int[] { 1, 1, 1, 2, 2, 3, 7, 3, 1 };
        int[] newArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {

                if (array[i] == array[j] && i != j) {
                    System.out.print(array[i]);

                    // for (int j2 = 0; j2 < newArray.length; j2++) {

                    // if (array[i] == newArray[j2]) {
                    // break;

                    // } else {
                    // newArray[count] = array[i];
                    // count++;
                    // }
                    // }

                }

            }

        }

        for (int i = 0; i < count; i++) {

            System.out.print(newArray[i]);
        }
    }
}