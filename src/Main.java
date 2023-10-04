import javax.swing.*;

public class Main {

    Main() {
        String vilkenVäxtInput = JOptionPane.showInputDialog("Vilken växt ska få mat?");

        Växter igge = new Kaktus("Igge", 0.2);                                 
        Växter laura = new Palm("Laura", 5);
        Växter olof = new Palm("Olof", 1);
        Växter meatloaf = new Köttätande("Meatloaf", 0.7);

        if (vilkenVäxtInput.equalsIgnoreCase(igge.getNamn())) {                       
            igge.printResult();
        } else if (vilkenVäxtInput.equalsIgnoreCase(laura.getNamn())) {
            laura.printResult();
        } else if (vilkenVäxtInput.equalsIgnoreCase(olof.getNamn())) {
            olof.printResult();
        } else if (vilkenVäxtInput.equalsIgnoreCase(meatloaf.getNamn())) {
            meatloaf.printResult();
        } else {
            JOptionPane.showMessageDialog(null, "Du måste skriva ett av namnen:" + "\n" +
                    igge.getNamn() + "\n" + laura.getNamn() + "\n" + olof.getNamn() + "\n" + meatloaf.getNamn());
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}