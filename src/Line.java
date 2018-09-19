import java.lang.Math;

public class Line {

    private double ax, ay, bx, by;
    private double length;

    private void setLength() {
        length = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2)) ;
    }

    public double getLength() {
        return length;
    }

    public void printInfo(){
        System.out.println("length: " + length);
    }

    public void setAx(double ax) {
        this.ax = ax;
        setLength();
    }

    public void setAy(double ay) {
        this.ay = ay;
        setLength();
    }

    public void setBx(double bx) {
        this.bx = bx;
        setLength();
    }

    public void setBy(double by) {
        this.by = by;
        setLength();
    }

    public double getAx() {
        return ax;
    }

    public double getAy() {
        return ay;
    }

    public double getBx() {
        return bx;
    }

    public double getBy() {
        return by;
    }

    public Line(Point a, Point b) {
        ax = a.getX();
        ay = a.getY();
        bx = b.getX();
        by = b.getY();
        setLength();
    }

}
