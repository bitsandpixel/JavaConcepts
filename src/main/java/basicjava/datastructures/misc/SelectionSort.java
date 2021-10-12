package myjava.datastructures.misc;

import java.util.Arrays;

/**
 * @author Vishnu Kandanelly
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] integerArray = {7, 3, 2, 5, 6, 10, 12};
        System.out.println("Before selection sort - in ascending order: ");
        Arrays.stream(integerArray).forEach(integer -> {
            System.out.print(integer + " ");
        });

        System.out.printf("%nperforming selection sort using basic for loop%n");

        for (int i = 0; i < integerArray.length; i++) {
            for (int j = i + 1; j < integerArray.length; j++) {
                if (integerArray[i] > integerArray[j]) {
                    int tempValue = integerArray[i];
                    integerArray[i] = integerArray[j];
                    integerArray[j] = tempValue;
                }
            }
        }

        System.out.println("After selection sort - in ascending order: ");
        Arrays.stream(integerArray).forEach(integer -> {
            System.out.print(integer + " ");
        });
        System.out.printf("%nperforming selection sort using library function%n");
        System.out.println("Before selection sort - in ascending order: ");
        integerArray = new int[]{7, 3, 2, 5, 6, 10, 12};
        Arrays.stream(integerArray).forEach(integer -> {
            System.out.print(integer + " ");
        });
        System.out.println("Before selection sort - in ascending order: ");
        Arrays.sort(integerArray);
        Arrays.stream(integerArray).forEach(integer -> {
            System.out.print(integer + " ");
        });
    }
}
