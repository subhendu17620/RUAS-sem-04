
public class GradeBookTest {
    String courseName;
    int[][] marks = new int[4][3];

    GradeBookTest(String courseName, int[][] marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    public void average() {
        int avg = 0;
        int rsum = 0;
        for (int i = 0; i < marks.length; i++) {
            rsum = 0;
            for (int j = 0; j < marks[i].length; j++) {
                rsum += marks[i][j];
            }
            avg = (rsum) / marks.length;
            System.out.println(avg);
        }
    }

    public void MaxMin() {
        int max = 0;
        int min = 0;
        for (int i = 0; i < marks[i].length; i++) {
            max = marks[0][i];
            min = marks[0][i];

            for (int j = 0; j < marks.length; j++) {
                if (max < marks[j][i]) {
                    max = marks[j][i];
                }
                if (min > marks[j][i]) {
                    min = marks[j][i];
                }
            }
            System.out.print("\nMAX of test " + i + "::" + max);
            System.out.print("\nMIN of test " + i + "::" + min);
        }

    }

    public static void main(String[] args) {
        int[][] marl = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        GradeBookTest g = new GradeBookTest("lul", marl);
        g.average();
        g.MaxMin();
    }

}
