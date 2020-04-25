package bubblesort;


import org.junit.jupiter.api.Test;
import src.main.java.bubblesort.BubbleSortExample;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortExampleTest {

    @Test
    public void testReverseOrder() {
        int[] data = {8,7,6,4,2};
        new BubbleSortExample().sortingFunction(data);
        assertArrayEquals(new int[]{2, 4, 6, 7, 8}, data);
    }

    @Test
    public void testHappyDay() {
        int[] data = {8,9,6,4,10};
        new BubbleSortExample().sortingFunction(data);
        assertArrayEquals(new int[]{4, 6, 8, 9, 10}, data);
    }

    @Test
    public void testAlreadySorted() {
        int[] data = {2,4,6,8,10};
        new BubbleSortExample().sortingFunction(data);
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, data);
    }

    @Test
    public void testEmpty() {
        int[] data = {};
        new BubbleSortExample().sortingFunction(data);
        assertArrayEquals(new int[]{}, data);
    }

}
