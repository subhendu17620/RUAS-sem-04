import java.util.Scanner;

/**
 * caseChange
 */
public class caseChange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ar[] = str.toCharArray();
        System.out.println("UPPERCASE : ");
        for (char c : ar) {

            if (c >= 'a' && c <= 'z') {
                System.out.printf("%c", c - 32);
            } else {
                System.out.print(c);
            }
        }
        System.out.println("\nlowercase :");

        for (char c : ar) {

            if (c >= 'A' && c <= 'Z') {
                System.out.printf("%c", c + 32);
            } else {
                System.out.print(c);
            }
        }
        sc.close();
    }
}