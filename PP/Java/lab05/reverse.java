import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

/**
 * reverse
 */
public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char temp;
        char ar[] = str.toCharArray();
        for (int i = 0; i < ar.length / 2; i++) {
            temp = ar[i];
            ar[i] = ar[ar.length - i - 1];
            ar[ar.length - i - 1] = temp;
        }

        for (char c : ar) {
            System.out.print(c);
        }
        sc.close();
    }

}