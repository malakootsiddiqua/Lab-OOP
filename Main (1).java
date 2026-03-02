public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen("blue", "gel");
        pen.write();

        Line l2= new Line(5, 6, 7, 8);
        l2.show();

        
        Point start = new Point(1, 2);

    
      
         Point end = new Point(3, 4);
        start.show();
        end.show();
    }
}
