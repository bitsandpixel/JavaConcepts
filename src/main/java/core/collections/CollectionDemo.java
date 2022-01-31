package core.collections;

import java.util.*;

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

        Iterator<Integer> iterator = integerCollection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        for (int i : integerCollection) {
//            System.out.println(i);
//        }


        //Here we would have the access to indexes compare to Collection
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(4);
        integerList.add(8);
        integerList.add(2, 6);

        Collections.reverse(integerList);

        for (Integer integer : integerList) {
            System.out.print(integer + " ");
        }


    }
}
