package geo;

public class Punkt {

    private static final double MAX = 10.0;
    private double x;
    private double y;

    public Punkt() {
        this(0.0, 0.0);
        System.out.println("Ctor Punkt");
    }
    public Punkt(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    private void setX(double x) {
        if(x > MAX) x = MAX;
        if(x < -MAX) x = -MAX;
        this.x = x;
    }

    public double getY() {
        return y;
    }

    private void setY(double y) {
        if(y > MAX) y = MAX;
        if(y < -MAX) y = -MAX;
        this.y = y;
    }

    public void rechts() {
        rechts(1.0);
    }
    public void rechts(double offset) {
        setX(getX() + offset);
    }
    public void links() {
        setX(getX() - 1);
    }

    public void oben() {
        setY(getY() + 1);
    }
    public void unten() {
        setY(getY() - 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName()+"{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
