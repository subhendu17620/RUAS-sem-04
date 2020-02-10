import java.util.Scanner;

/**
 * index
 */
public class index {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int currIndex = str.indexOf('a');
        int count = 0;
        while (currIndex != -1) {
            currIndex = str.indexOf('a', currIndex + 1);
            count += 1;
        }
        System.out.println(count);
        sc.close();
    }
}