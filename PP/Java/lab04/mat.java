/**
 * mat
 */
public class mat {

    public static void main(String[] args) {
        int rsum = 0;
        int csum = 0;
        int[][] mat = new int[3][];
        for (int i = 0; i < mat.length; i++) {
            rsum = 0;
            csum = 0;
            for (int j = 0; j < mat.length; j++) {
                rsum += mat[i][j];
                csum += mat[j][i];
                System.out.println("sum of row "+i+":"+rsum+"sum of column "+i+": "+csum);

            }
        }
    }
}