/**
 * Employee
 */
public class Employee {

    // instance variables
    String fName, lName;
    double mSalary;
    int workHours;

    // constructor - initialing variables
    Employee(String fName, String lName, double mSalary) {
        this.fName = fName;
        this.lName = lName;
        this.mSalary = mSalary;
    }

    // setInfo - to update
    public void setInfo(double mSalary, int workHours) {
        if (mSalary >= 0) {
            this.mSalary = mSalary;
        }
        this.workHours = workHours;
    }

    public void getInfo() {
        System.out.println("Salary of " + this.fName + " " + this.lName + " is " + this.mSalary);
    }

    public void giveRaise(Double percent) {
        this.mSalary = percent * 0.01 * this.mSalary + this.mSalary;
    }

    public void getAnnualSal() {
        double annualSal = mSalary * 12;
        System.out.println("the annual Salary is " + annualSal);
    }

}