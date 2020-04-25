package src.main.java.bubblesort;

import java.util.Arrays;

public class BubbleSortExample {

    public static void main(String[] args) {
        int[] data = {8,7,6,4,2};
        new BubbleSortExample().sortingFunction(data);
        System.out.println(Arrays.toString(data));
    }

    /*
     * In the pseudo code we have 'for i = 0 to A.length-2'
     * Both values 0 and A.length-2 are inclusive, so in the java code below
     * we are having the condition i < data.length - 1
     * if you want you can change it to i <= data.length - 2
     *
     */
    public void sortingFunction(int[] arrayOfInteger) {

        for (int i = 0; i < arrayOfInteger.length - 1; i++) {
            for (int j = 0; j < arrayOfInteger.length - 1 - i; j++) {
                // do the swap if required
                if (arrayOfInteger[j] > arrayOfInteger[j+1]) {
                    int tempVar = arrayOfInteger[j+1];
                    arrayOfInteger[j+1] = arrayOfInteger[j];
                    arrayOfInteger[j] = tempVar;
                }
            }
        }
    }
}
