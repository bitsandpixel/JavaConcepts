package advancedjava.java8features;

import java.util.Arrays;
import java.util.List;

/**
 * This class contains the example of ForEach method to loops through a list of elements.
 * Discusses how different it is from traditional external loops of java
 */
public class ForEachDemo {
    public static void main(String[] args) {
        /*Lets take an example List*/
        /*these are number of ways to create lists*/

        /*
        // For ArrayList
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        System.out.println("ArrayList : " + list.toString());

        // For LinkedList
        List<Integer> llist = new LinkedList<Integer>();
        llist.add(2);
        llist.add(4);
        System.out.println("LinkedList : " + llist.toString());

        // For Stack
        List<Integer> stack = new Stack<Integer>();
        stack.add(3);
        stack.add(1);
        System.out.println("Stack : " + stack.toString());
         */

        /* for this example we would use Array's asList method to create the list*/

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Looping through the list using traditional external for loop");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }

        System.out.println();

        System.out.println("Looping through the list using external for-each loop or enhanced for loop(it is introduced since J2SE 5.0)");
        for (int value : integerList) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println("Looping through the list using an internal ForEach loop introduced in Java 8");
        integerList.forEach(integer -> System.out.print(integer+" "));
        /*
        The advantage of using collection, since this is an internal part of the collection, it would be much faster than the external loop.
         */
    }
}


