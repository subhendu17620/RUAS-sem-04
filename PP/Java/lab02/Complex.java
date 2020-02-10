/**
 * Complex
 */
public class Complex {

    double real, imagi;

    Complex(double real, double imagi) {
        this.real = real;
        this.imagi = imagi;
    }

    public static Complex sum(Complex obj1, Complex obj2) {
        double real1 = obj1.real + obj2.real;
        double imagi1 = obj1.imagi + obj2.imagi;
        Complex result = new Complex(real1, imagi1);
        return result;
    }

    public static Complex diff(Complex obj1, Complex obj2) {
        double real1 = obj1.real - obj2.real;
        double imagi1 = obj1.imagi - obj2.imagi;
        Complex result = new Complex(real1, imagi1);
        return result;
    }

    public static Complex mul(Complex obj1, Complex obj2) {
        double real1 = obj1.real * obj2.real - obj1.imagi * obj2.imagi;
        double imagi1 = obj1.real * obj2.imagi + obj2.real * obj1.imagi;
        Complex result = new Complex(real1, imagi1);
        return result;
    }

    public void disp() {
        System.out.println(this.real + " + " + this.imagi + "i");
    }

}