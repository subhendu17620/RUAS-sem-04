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
        for (int i = 0; i < grades.length; i++) {
            System.out.println(this.grades[i]) 
        }
        

    }

    public static void main(String[] args) {

    }
}