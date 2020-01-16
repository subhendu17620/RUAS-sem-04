import java.util.*;

public class PosNeg {
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Positive Number");
        }
        sc.close();
    }
}