package core.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html:
 * Resizable-array implementation of the List interface. Implements all optional list operations,
 * and permits all elements, including null. In addition to implementing the List interface,
 * this class provides methods to manipulate the size of the array that is used internally to store the list.
 * (This class is roughly equivalent to Vector, except that it is not synchronized.)
 *
 * @author Vishnu Kandanelly
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        System.out.println("------------------- ArrayList Demo ----------------------------");
        ArrayList<Integer> integers = new ArrayList<>();

        integers = new IntegerWareHouse().addIntegers(integers, new int[]{1, 2, 3});

        IntegerWareHouse.displayIntegers(integers);

        System.out.printf("%nSize of an Integer ArrayList: %d%n", integers.size());

        System.out.println("Retrieving an element at a given Index: " + integers.get(2));

        System.out.println("Retrieving an index of a given element: "
                + integers.indexOf(3));

        /*Adding all elements of a collection*/
        integers.addAll(3, Collections.unmodifiableList(integers));

        IntegerWareHouse.displayIntegers(integers);

        /*Removing elements*/
        System.out.println("Removing an element at given index" + integers.remove(2));

        IntegerWareHouse.displayIntegers(integers);

        System.out.println("Removing a specific element" + integers.remove(Integer.valueOf(2)));

        IntegerWareHouse.displayIntegers(integers);

        System.out.println("Adding an element(0) at a given index(4)");
        integers.add(4, 0);
        IntegerWareHouse.displayIntegers(integers);

        System.out.println("Changing an element at a given index" + integers.set(4, 4));

        IntegerWareHouse.displayIntegers(integers);

        System.out.println("Removing all items from an ArrayList");
        integers.clear();


    }

}

class IntegerWareHouse {

    public static void displayIntegers(ArrayList<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + " ");
        }
        System.out.println("");
    }

    /**
     * Adding given values to an ArrayList
     *
     * @param integers Given ArrayList to add values
     * @param ints     given integer array
     * @return returns the ArrayList after adding the new values
     */
    public ArrayList<Integer> addIntegers(ArrayList<Integer> integers, int[] ints) {
        /*
         * In an ArrayList, we can store objects(String, Integer, Boolean, Double,Character,etc),
         * not a primitive type(int, boolean, double, char,etc)
         */
        for (int anInt : ints) {
            integers.add(anInt);
        }
        return integers;
    }
}
