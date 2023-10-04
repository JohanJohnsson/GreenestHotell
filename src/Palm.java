import InlämningsUppgiftGreenest.TypAvPlanta;

import javax.swing.*;

//Palm ärver Växter som implemeterar interfacet VätskaMängd
public class Palm extends Växter {
    private double kranVatten;
    protected TypAvPlanta plantTyp = TypAvPlanta.PALM;


    public Palm(String namn, double längd) {
        super(namn, längd);
        this.kranVatten = 0.5 * längd;
    }

    @Override
    public TypAvPlanta getPlantTyp() {
        return plantTyp;
    }

    @Override
    public double getMängdVätska() {
        return kranVatten;
    }

    @Override
    void printResult() {
        JOptionPane.showMessageDialog(null, getPlantTyp().plantTyp +
                " " + getNamn() + " behöver " +
                getMängdVätska() + " liter kranvatten");
    }

}

