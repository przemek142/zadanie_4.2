public class Compare {
    public boolean isEqual;
    private double length, ax, ay, bx, by;


    public Line returnGrater(Line line1, Line line2) {
        if (line1.getLength() > line2.getLength()) {
            isEqual = false;
            length = line1.getLength();
            ax=line1.getAx();
            ay=line1.getAy();
            bx=line1.getBx();
            by=line1.getBy();
            return line1;
        } else if (line1.getLength() < line2.getLength()) {
            isEqual = false;
            length = line2.getLength();
            ax=line2.getAx();
            ay=line2.getAy();
            bx=line2.getBx();
            by=line2.getBy();
            return line2;
        } else {
            isEqual = true;
            length = line1.getLength();
            ax=line1.getAx();
            ay=line1.getAy();
            bx=line1.getBx();
            by=line1.getBy();
            return line1;
        }
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

    public void printInfo() {
        if (isEqual == true) {
            System.out.println("Linie są równe, zwrócono pierwszy argument :" + length);
        } else {
            System.out.println("Zwrócono dłuższą linię :" + length);
        }
    }
}
