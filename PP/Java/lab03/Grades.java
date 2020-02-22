/**
 * grades
 */
public class Grades {
    String course;
    int grades[];

    Grades(String course, int grades[]) {
        this.course = course;
        this.grades = grades;
    }

    public void gradeReport() {
        String report[] = new String[11];

        for (int i = 0; i < report.length; i++) {
            report[i] = "";
        }

        for (int i : this.grades) {
            if (i >= 0 && i < 10) {
                report[1] += "*";
            } else if (i >= 10 && i < 20) {
                report[2] += "*";
            } else if (i >= 20 && i < 30) {
                report[3] += "*";
            } else if (i >= 30 && i < 40) {
                report[4] += "*";
            } else if (i >= 40 && i < 50) {
                report[5] += "*";
            } else if (i >= 50 && i < 60) {
                report[6] += "*";
            } else if (i >= 60 && i < 70) {
                report[7] += "*";
            } else if (i >= 80 && i < 90) {
                report[8] += "*";
            } else if (i >= 90 && i < 100) {
                report[9] += "*";
            } else if (i == 100) {
                report[10] += "*";
            }
        }
        for (int j = 1; j < report.length; j++) {
            System.out.println((10 * (j - 1)) + "-" + (10 * (j) - 1) + " : " + report[j]);
        }
    }
}