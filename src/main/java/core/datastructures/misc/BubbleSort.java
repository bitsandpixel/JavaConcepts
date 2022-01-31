package core.datastructures.misc;

import java.util.Arrays;

/**
 * @author Vishnu Kandanelly
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] integerArray = {7, 3, 2, 5, 6, 10, 12};
        System.out.println("Before bubble sort - in ascending order: ");
        Arrays.stream(integerArray).forEach(integer -> {
            System.out.print(integer + " ");
        });

        System.out.println("performing bubble sort using basic for loop");
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < (integerArray.length - 1); i++) {
                if (integerArray[i] > integerArray[i + 1]) {
                    int tempValue = integerArray[i];
                    integerArray[i] = integerArray[i + 1];
                    integerArray[i + 1] = tempValue;
                    isSorted = false;
                }
            }
        }
        System.out.println("after bubble sort - in ascending order: ");
        Arrays.stream(integerArray).forEach(integer -> {
            System.out.print(integer + " ");
        });

    }
}
