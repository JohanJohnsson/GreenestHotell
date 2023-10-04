import InlämningsUppgiftGreenest.TypAvPlanta;

import javax.swing.*;

//Kaktus ärver Växter som implemeterar interfacet VätskaMängd
public class Kaktus extends Växter {

    final private double mineralVatten = 0.2;
    protected TypAvPlanta plantTyp = TypAvPlanta.KAKTUS;


    public Kaktus(String namn, double längd) {
        super(namn, längd);
    }
                 //POLYMORFISM, metoderna får olika former utifrån vilket objekt som skapas 
    @Override
    public TypAvPlanta getPlantTyp() {
        return plantTyp;
    }

    @Override
    final public double getMängdVätska() {
        return mineralVatten;

    }

    @Override
    void printResult() {
        JOptionPane.showMessageDialog(null, getPlantTyp().plantTyp +
                " " + getNamn() + " behöver " +
                getMängdVätska() + " liter mineralvatten");
    }

}

