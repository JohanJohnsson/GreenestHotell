import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    //Enhetstest för uträkningen av Palmer

class PalmTest {

    Växter laura = new Palm("Laura", 5);
    Växter olof = new Palm("Olof", 1);
    
    @Test
    void getMängdVätska() {
        double förväntadMängdVätskaLaura = 2.5;
        double faktskMängdVätskaLaura = laura.getMängdVätska();
        Assertions.assertEquals(förväntadMängdVätskaLaura, faktskMängdVätskaLaura);
        double förväntadMängdVätskaOlof = 0.5;
        double faktskMängdVätskaOlof = olof.getMängdVätska();
        Assertions.assertEquals(förväntadMängdVätskaOlof, faktskMängdVätskaOlof);

    }
}