package hu.ruander.alakzatok;



public class Hasab extends FemAlakzat {
    double i;
    double i1;
    double i2;

    public Hasab(double i, double i1, double i2) {
        this.i = i;
        this.i1 = i1;
        this.i2 = i2;
    }

    @Override
    public double terfogat() {
        return 1*i1*i2;
    }

    public double getA() {
        return this.i;
    }
    public double getB() {
        return this.i1;
    }
    public double getM() {
        return this.i2;
    }
}
