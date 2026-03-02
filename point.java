public class Point {
    private double x;
    private double y;

    Point(){
        this.x = 0;
        this.y = 0;
    }

    Point(double x , double y){
        this.x = x;
        this.y = y;
    }
    Point(Point p3){
        this.x = p3.x;
        this.y = p3.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    @Override
    public String toString(){
        return "the value of x and y are: "+x+" "+y;
    }
}
public class Main{
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point(3,5);
        Point p3 = new Point(p2);

        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}