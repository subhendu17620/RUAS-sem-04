/**
 * EmpMain
 */
public class EmpMain {

    public static void main(String[] args) {
        Employee e1 = new Employee("subhendu", "maji", 7852.0);
        e1.getInfo();
        e1.setInfo(8000.0, 5);
        e1.getInfo();

        e1.giveRaise(50.0);
        e1.getInfo();
        e1.getAnnualSal();

        Employee e2 = new Employee("abc", "xyz", 4521.0);
        e2.getInfo();
        e2.setInfo(5000.0, 5);
        e2.getInfo();

        e2.giveRaise(10.0);
        e2.getInfo();
        e2.getAnnualSal();

    }
}