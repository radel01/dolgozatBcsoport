package hu.ruander.alakzatok;

public abstract class FemAlakzat  {

    private static double fajsuly = 1.15;

    public static double getFajsuly() {
        return fajsuly;
    }

    public abstract double terfogat();

    public double suly() {

        return fajsuly*terfogat();
    }
}
