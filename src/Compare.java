public class Compare {

    public Line returnGrater(Line line1, Line line2) {
        line1.setLength();
        line2.setLength();

        if (line1.getLength() > line2.getLength()) {
            return line1;
        } else {
            return line2;
        }
    }

    public void printInfo(Line line) {

        System.out.printf("Długość dłuższej linii: %.1f; Start(%.1f,%.1f); End(%.1f,%.1f);\n",
                line.getLength(),
                line.getAx(), line.getAy(),
                line.getBx(), line.getBy()
        );

    }
}
