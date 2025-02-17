package hu.ruander;

import hu.ruander.alakzatok.FemAlakzat;
import hu.ruander.alakzatok.Gomb;

import java.util.ArrayList;
import java.util.List;

public class FemAlakzatokProgram {
    private ArrayList<FemAlakzat> alakzatok;

//    public FemAlakzatokProgram() {
//        new FemAlakzatokProgram(alakzatok);
//    }
//
//    public FemAlakzatokProgram(ArrayList<FemAlakzat> alakzatok) {
//        this.alakzatok=alakzatok;
//    }

    public void ujAlakzat(FemAlakzat alakzat) {
        this.alakzatok=  new ArrayList<>(List.of(alakzat));
    }

    public ArrayList<FemAlakzat> getLista() {
        return new ArrayList<>(alakzatok) ;
    }

    public double osszSuly() {
        double ossz = 0;
        for (FemAlakzat alakzat : alakzatok){
            ossz += alakzat.suly();
        }
        return ossz ;
    }

    public double gombokOsszSuly() {
        double ossz = 0;
        for (FemAlakzat alakzat : alakzatok){
            if (alakzat instanceof Gomb)
                ossz += alakzat.suly();
        }
        return ossz;
    }

    public FemAlakzat minV() {
        int min = 0;
        for (int i=1;i<alakzatok.size();i++){
            FemAlakzat aktAlakzat = alakzatok.get(i);
            FemAlakzat mAlakzat = alakzatok.get(min);
            if(aktAlakzat.terfogat() < mAlakzat.terfogat()){
                min=i;
            }
        }
        return alakzatok.get(min);
    }

    public FemAlakzat maxV() {
        int max = 0;
        for (int i=1;i<alakzatok.size();i++){
            FemAlakzat aktAlakzat = alakzatok.get(i);
            FemAlakzat mAlakzat = alakzatok.get(max);
            if(aktAlakzat.terfogat() > mAlakzat.terfogat()){
                max=i;
            }
        }
        return alakzatok.get(max);
    }
}
