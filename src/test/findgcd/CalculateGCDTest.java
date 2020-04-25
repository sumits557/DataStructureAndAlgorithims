package findgcd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.main.java.findgcd.CalculateGCD;

public class CalculateGCDTest {

    @Test
    public  void  testCalculatedGCD () {
        Assertions.assertEquals(new CalculateGCD().findGcd(25, 10), 5);
    }
}
