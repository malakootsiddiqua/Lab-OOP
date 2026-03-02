#include <iostream>
using namespace std;

class Complex {
private:
    double real;
    double imag;

public:
    // Default Constructor
    Complex() {
        real = 0;
        imag = 0;
    }

    // Parameterized Constructor
    Complex(double r, double i) {
        real = r;
        imag = i;
    }

    // Function to add two complex numbers
    Complex add(Complex c) {
        return Complex(real + c.real, imag + c.imag);
    }

    // Function to subtract
    Complex subtract(Complex c) {
        return Complex(real - c.real, imag - c.imag);
    }

    // Function to multiply
    Complex multiply(Complex c) {
        double r = real * c.real - imag * c.imag;
        double i = real * c.imag + imag * c.real;
        return Complex(r, i);
    }

    // Display function
    void display() {
        if (imag >= 0)
            cout << real << " + " << imag << "i" << endl;
        else
            cout << real << " - " << -imag << "i" << endl;
    }
};

int main() {
    Complex c1(3, 4);
    Complex c2(1, 2);

    Complex sum = c1.add(c2);
    Complex diff = c1.subtract(c2);
    Complex prod = c1.multiply(c2);

    cout << "First Complex: ";
    c1.display();

    cout << "Second Complex: ";
    c2.display();

    cout << "Addition: ";
    sum.display();

    cout << "Subtraction: ";
    diff.display();

    cout << "Multiplication: ";
    prod.display();

    return 0;
}