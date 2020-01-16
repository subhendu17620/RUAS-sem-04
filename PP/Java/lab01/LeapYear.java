import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year : ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.print("Leap Year");
        } else {
            System.out.print("not Leap Year");
        }

        sc.close();
    }
}