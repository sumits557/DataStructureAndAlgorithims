package circlecalculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.main.java.circlecalculation.Circle;

public class CircleTest {

    @Test
    public void testArea() {
        Assertions.assertEquals(new Circle(1.7).findArea(), 12.77);
    }

    @Test
    public void testPerimeter() {
        Assertions.assertEquals(new Circle(2.7).findPerimeter(), 17.77);
    }
}
