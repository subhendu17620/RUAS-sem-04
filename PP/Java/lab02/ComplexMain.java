/**
 * ComplexMain
 */
public class ComplexMain {

    public static void main(String args[]) {
        Complex c1 = new Complex(5.5, 4);
        Complex c2 = new Complex(1.2, 3.5);
        Complex sum = Complex.sum(c1, c2);
        Complex diff = Complex.diff(c1, c2);
        Complex prod = Complex.mul(c1, c2);
        sum.disp();
        diff.disp();
        prod.disp();
    }
}