public class Main {
    public static void main(String[] args) {

        // Object create
        Point p1 = new Point(3, 5);

        // Direct print (toString automatically call hota hai)
        System.out.println("Point is: " + p1);

        // show() method call
        p1.show();

        // Values change karte hain
        p1.setX(10);
        p1.setY(20);

        System.out.println("After updating:");
        p1.show();
    }
}