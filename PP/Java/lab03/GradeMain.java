/**
 * GradeMain
 */
public class GradeMain {

    public static void main(String[] args) {
        int mark[] = new int[] { 8, 18, 5, 50, 54, 49, 82, 52, 16, 33, 45, 62 };
        Grades gr = new Grades("dm", mark);
        gr.gradeReport();
    }

}