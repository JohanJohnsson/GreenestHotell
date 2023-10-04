import InlämningsUppgiftGreenest.TypAvPlanta;
import InlämningsUppgiftGreenest.VätskeMängd;

//Växter implementerar VätskeMängd
abstract class Växter implements VätskeMängd {
    private String namn;                    //Ett exempel på inkapsling, private

    private double längd;


    public Växter(String namn, double längd) {
        this.namn = namn;
        this.längd = längd;
    }

    public double getLängd() {
        return längd;
    }

    public String getNamn() {
        return namn;
    }

    abstract public double getMängdVätska();

    abstract TypAvPlanta getPlantTyp();

    abstract void printResult();

}
