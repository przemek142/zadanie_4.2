import java.lang.Math;

public class Line {
    Point start, end;
    private double length;

    public void setLength() {
        length = Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2)) ;
    }

    public double getLength() {

        return length;
    }

    public void setAx(double ax) {
        start.setX(ax);
    }

    public void setAy(double ay) {
        start.setY(ay);
    }

    public void setBx(double bx) {
        end.setX(bx);
    }

    public void setBy(double by) {
        end.setY(by);
    }

    public double getAx()
    {
        return start.getX();
    }

    public double getAy() {

        return start.getY();
    }

    public double getBx() {

        return end.getX();
    }

    public double getBy() {
        return end.getY();
    }

    public Line(Point a, Point b) {
        start=a;
        end=b;
    }

}
