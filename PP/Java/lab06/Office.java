/**
 * Office
 */
public class Office {

    int empno;
    String empname;
    public double salary;

    Office(int empno, String empname, double salary) {
        this.empno = empno;
        this.empname = empname;
        this.salary = salary;
    }

    public double getvalue() {
        return salary;
    }
}