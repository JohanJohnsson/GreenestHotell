import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    //Enhetstest för kaktus, ingen uträkning pga konstant 0,2 liter

class KaktusTest {
    
    Växter igge = new Kaktus("Igge", 0.02);
    
    @Test
    void getMängdVätska() {
        double förväntadMängdVätskaIgge = 0.02;
        double faktiskMängdVätskaIgge = igge.getMängdVätska();
        Assertions.assertEquals(förväntadMängdVätskaIgge, faktiskMängdVätskaIgge);
    }
}