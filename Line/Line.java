
public class Line {
    private int startX, startY;
    private int endX, endY;

    public Line(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public void show() {
        System.out.println("Start Point: (" + startX + ", " + startY + ")");
        System.out.println("End Point  : (" + endX + ", " + endY + ")");
    }
}


