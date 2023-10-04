package InlämningsUppgiftGreenest;

//Här använder jag mig av enums eftersom typen av växter är ett bestämt antal
public enum TypAvPlanta {
    KAKTUS("Kaktusen"),
    PALM("Palmen"),
    KÖTTÄTANDE("Köttätande växten");

    public final String plantTyp;

    TypAvPlanta(String s) {
        plantTyp = s;
    }
}
