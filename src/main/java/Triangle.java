public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int a, int b, int c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    boolean allPositive() {
        return sideA > 0 && sideB > 0 && sideC > 0;
    }

    public boolean isValid() {
        return allPositive();
    }

    boolean allNotEqual() {
        return (sideA < (sideB + sideC) &&
                sideB < (sideA + sideC) &&
                sideC < (sideA + sideB));
    }
}
