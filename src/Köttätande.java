import InlämningsUppgiftGreenest.TypAvPlanta;

import javax.swing.*;

//Köttätande ärver Växter som implemeterar interfacet VätskeMängd
public class Köttätande extends Växter {
    private double proteinDryck;
    protected TypAvPlanta plantTyp = TypAvPlanta.KÖTTÄTANDE;
    
    public Köttätande(String namn, double längd) {
        super(namn, längd);
        this.proteinDryck = 0.1 + (0.2 * längd);
    }

    @Override
    public TypAvPlanta getPlantTyp() {
        return plantTyp;
    }

    @Override
    public double getMängdVätska() {
        return proteinDryck;
    }

    @Override
    void printResult() {
        JOptionPane.showMessageDialog(null, getPlantTyp().plantTyp +
                " " + getNamn() + " behöver " +
                getMängdVätska() + " liter proteindryck");
    }

}

