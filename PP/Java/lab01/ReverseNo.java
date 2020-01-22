package lab01;

import java.util.*;

public class ReverseNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int n = num;
        int rev = 0;
        // reverse using while loop
        while (num != 0) {
            rev = rev * 10;
            rev = rev + num % 10;
            num = num / 10;
        }
        System.out.println("the reverse of the number using while-loop is " + rev);
        // reverse using for loop
        int r = 0;
        for (int i = n; i > 0; i = i / 10) {
            r = r * 10;
            r = r + i % 10;
        }

        System.out.println("the reverse of the number using for-loop is " + r);
        sc.close();
    }
}
