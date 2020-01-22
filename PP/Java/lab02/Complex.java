public class Complex {

    double real, img;

    // constructor to initialize the complex number
    Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public static Complex sum(Complex c1, Complex c2) {
        Complex res = new Complex(0, 0);

        res.real = c1.real + c2.real;
        res.img = c1.img + c2.img;
        // returning the output complex number
        return res;
    }
}