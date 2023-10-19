package unlp.info.math;

import java.util.Objects;

public final class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    double realPart(){
        return re;
    }

    double imaginaryPart(){
        return im;
    }

    Complex add(Complex c){
        this.re+=c.re;
        this.im+=c.im;
        return this;
    }

    Complex sub(Complex c){
        this.re+=c.re;
        this.im+=c.im;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(re, complex.re) == 0 && Double.compare(im, complex.im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    @Override
    public String toString() {
        return this.re + " + " + this.im +"i";
    }
}
