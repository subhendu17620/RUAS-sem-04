/**
 * ComplexMain
 */
public class ComplexMain {

    public static void main(String args[]) {
        Complex c1 = new Complex(5.5, 4);
        Complex c2 = new Complex(1.2, 3.5);
        Complex temp = Complex.sum(c1, c2);
        System.out.printf("Sum is: " + temp.real + " + " + temp.img + "i");

    }

}