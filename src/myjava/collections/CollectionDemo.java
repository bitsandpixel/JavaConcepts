package myjava.collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Vishnu Kandanelly
 */
public class CollectionDemo {
    public static void main(String[] args) {

        //Raw usage
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(1.2);
        collection.add("Vishnu");

        collection.remove(1);


        //Integer type collection
        Collection<Integer> integerCollection = new ArrayList<>();
        integerCollection.add(1);
        integerCollection.add(2);
        integerCollection.add(3);
        integerCollection.add(4);

        for (int i : integerCollection) {
            System.out.println(i);
        }


    }
}
