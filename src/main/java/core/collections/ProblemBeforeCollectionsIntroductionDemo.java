package core.collections;

import java.util.Hashtable;
import java.util.Vector;

/**
 * Collection framework has introduced in Java 1.2
 *
 * @author Vishnu Kandanelly
 */
public class ProblemBeforeCollectionsIntroductionDemo {
    public static void main(String[] args) {
        //Creating array, vector, hashtable
        int[] integerArray = {1, 2, 3, 4};
        Vector<Integer> integerVector = new Vector<>();/*can also defined size here*/
        Hashtable<Integer, String> integerStringHashtable = new Hashtable<>();

        /*adding values into the vector*/
        integerVector.addElement(1);
        integerVector.addElement(2);
        integerVector.addElement(3);
        integerVector.addElement(4);

        /*adding values into the Hashtable*/
        integerStringHashtable.put(1, "one");
        integerStringHashtable.put(2, "two");
        integerStringHashtable.put(3, "three");
        integerStringHashtable.put(4, "four");

        // Array instance creation requires [],
        // while Vector and hastable require ()
        // Vector element insertion requires addElement(),
        // but hashtable element insertion requires put()

        // Accessing the first element of the
        // array, vector and hashtable
        System.out.println(integerArray[0]);
        System.out.println(integerVector.elementAt(0));
        System.out.println(integerStringHashtable.get(1));

    }
}
