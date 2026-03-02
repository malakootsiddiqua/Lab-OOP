public class RationalNumber {
    private int numerator;
    private int denominator;

    // Constructor
    public RationalNumber(int numerator , int denominator){
        if(denominator == 0){
            throw new IllegalArgumentException("DENOMINATOR CANNOT BE ZERO");
        }
        this.numerator = numerator;
        this.denominator =denominator;
        simplify();
    }
    // gcd
    private int gcd(int a , int b){
        return b==0?a: gcd(b,a%b);
    }


    // Simplify the fraction
    private void simplify() {
        int g = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= g;
        denominator /= g;

        // Keep denominator positive
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }
    public int lcm(int a , int b){
        return (a*b)/gcd(a,b);
    }
    public RationalNumber add(RationalNumber other){
        int lcm = lcm(this.denominator,other.denominator);
        int newNum = this.numerator*(lcm/this.denominator) + other.numerator*(lcm/other.denominator);
        return new RationalNumber(newNum,lcm);
    }
    public RationalNumber sub(RationalNumber other){
        int lcm = lcm(this.denominator,other.denominator);
        int newNum = this.numerator*(lcm/this.denominator) - other.numerator*(lcm/other.denominator);
        return new RationalNumber(newNum,lcm);
    }
    public RationalNumber mul(RationalNumber other){
        int num = this.numerator* other.numerator;
        int den = this.denominator* other.denominator;
        return new RationalNumber(num , den);
    }
    public RationalNumber div(RationalNumber other){
        if(other.numerator == 0){
            throw new ArithmeticException("Division by zero");
        }
        int num = this.numerator*other.denominator;
        int den = this.denominator* other.denominator;
        return new RationalNumber(num , den);

    }

    //getters
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    // setters
    public void set(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public String toString(){
        return numerator+"/"+denominator;
    }
    public RationalNumber clone(){
        return new RationalNumber(this.numerator,this.denominator);
    }
}