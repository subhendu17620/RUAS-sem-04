/**
 * ComplexOp
 */
public class ComplexOp {

    public static void main(String[] args) {
        Complex c1 = new Complex(10.0, 11.0);
        Complex c2 = new Complex(12.0, 13.0);
        Complex sum = Complex.sum(c1, c2);
        Complex diff = Complex.diff(c1, c2);
        Complex prod = Complex.mul(c1, c2);
        sum.disp();
        diff.disp();
        prod.disp();
    }
}