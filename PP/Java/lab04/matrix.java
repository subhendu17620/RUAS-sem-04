import java.util.Scanner;

/**
 * matrix
 */
public class matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter size : ");
        n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("enter element: ");
                mat[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i <= j) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (j <= i) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}