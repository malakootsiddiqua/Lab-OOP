public class Main {
    public static void main(String[] args) {

        RationalNumber r1 = new RationalNumber(3,12);
        RationalNumber r2 = new RationalNumber(3,4);


        System.out.println("First Rational: " + r1);
        System.out.println("Second Rational: " + r2);
        System.out.println("Addition: " + r1.add(r2));
        System.out.println("Subtraction: " + r1.sub(r2));
        System.out.println("Multiplication: " + r1.mul(r2));
        System.out.println("Division: " + r1.div(r2));
        System.out.println("LCM of denominators: " + r1.lcm(r1.getDenominator(), r2.getDenominator()));
        System.out.println(r1.clone());
    }
}