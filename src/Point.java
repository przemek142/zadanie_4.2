public class Point {
    private double x, y;

    private void setX(double x) {
        this.x = x;
    }

    private void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y){
        setX(x);
        setY(y);
    }
}
