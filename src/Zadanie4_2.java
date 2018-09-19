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


        line.printInfo();
        line2.printInfo();

        lineTest=compare.returnGrater(line,line2);

        compare.printInfo();
        System.out.printf("Długość: %.2f, początek: (%.1f,%.1f), koniec: (%.1f,%.1f)\n ",
                lineTest.getLength(),
                lineTest.getAx(),
                lineTest.getAy(),
                lineTest.getBx(),
                lineTest.getBy()
        );

        line2.setBy(50);

        lineTest=compare.returnGrater(line,line2);

        compare.printInfo();
        System.out.printf("Długość: %.2f, początek: (%.1f,%.1f), koniec: (%.1f,%.1f)\n ",
                lineTest.getLength(),
                lineTest.getAx(),
                lineTest.getAy(),
                lineTest.getBx(),
                lineTest.getBy()
        );

        line2.setBy(5);

        lineTest=compare.returnGrater(line,line2);

        compare.printInfo();
        System.out.printf("Długość: %.2f, początek: (%.1f,%.1f), koniec: (%.1f,%.1f)\n ",
                lineTest.getLength(),
                lineTest.getAx(),
                lineTest.getAy(),
                lineTest.getBx(),
                lineTest.getBy()
        );
    }
}
