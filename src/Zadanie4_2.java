public class Zadanie4_2 {
    public static void main(String[] args) {
        Line lineTest;

        Compare compare = new Compare();

        Point a1 = new Point(0, 0);
        Point b1 = new Point(0, 5);
        Point a2 = new Point(0, 0);
        Point b2 = new Point(0, 10);
        Line line = new Line(a1, b1);
        Line line2 = new Line(a2, b2);

        compare.printInfo(compare.returnGrater(line, line2));

        line2.setBy(50);
        compare.printInfo(compare.returnGrater(line, line2));

        line2.setBy(5);
        compare.printInfo(compare.returnGrater(line, line2));

    }
}
