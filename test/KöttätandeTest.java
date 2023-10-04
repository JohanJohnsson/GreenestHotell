import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    //Enhetstest för uträkningen av Köttätande växt

class KöttätandeTest {
    
    Växter meatloaf = new Köttätande("Meatloaf", 0.7);
    
    @Test
    void getMängVätska() {
        double förväntadMängdVätskaMeatloaf = 0.24;
        double faktskMängdVätskaMeatloaf = meatloaf.getMängdVätska();
        Assertions.assertEquals(förväntadMängdVätskaMeatloaf, faktskMängdVätskaMeatloaf);


    }

}