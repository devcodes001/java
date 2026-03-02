class Complex {
    double real;
    double imag;

    
    Complex(double r, double i) {
        this.real = r;
        this.imag = i;
    }

   
    public static Complex add(Complex n1, Complex n2) {
        return new Complex(n1.real + n2.real, n1.imag + n2.imag);
    }

    
    public void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }
}

class Complex1 {
    public static void main(String[] args) {
        Complex c1 = new Complex(4.5, 5.0);
        Complex c2 = new Complex(2.5, 3.5);

        Complex temp = Complex.add(c1, c2);

        System.out.print("Sum: ");
        temp.display();
    }
}
