package hu.ruander.alakzatok;



public class Gomb extends FemAlakzat {
    double i;

    public Gomb(double i) {
        this.i=i;
    }

    @Override
    public double terfogat() {
        return (4*(i*i*i)*Math.PI)/3;
    }
}
