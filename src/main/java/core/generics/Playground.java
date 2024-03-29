package core.generics;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vishnu Kandanelly
 */
public class Playground {
    public static void main(String[] args) {
//        simple example of importance of generics

//        create a list of "things"
        List values = new ArrayList();

//        no type safety
        values.add(1);
        values.add("generics");

//        without generics requires casting
        int num = (int) values.get(0);
        String name = (String) values.get(1);

//        using generics
//        creating a list of "integers"
        List<Integer> numbers = new ArrayList<>();

//        adding other "type" values would throw an error
//        numbers.add("generics");

        numbers.add(101);
        numbers.add(102);


//        creating a list of "strings"

        List<String> names = new ArrayList<>();
        names.add("generics");
        names.add("collections");

//        when using generics, no type casting is required to retrieve the data
        int firstNum = numbers.get(0);
        String firstName = names.get(0);

        System.out.println(firstNum + ", " + firstName);

        Row row = new Row(100);
        Tree<Row> rowTree = new Tree<>(row);
        rowTree.root.data.number = 1;
    }

    @Data
    private static class Row {
        private int number;

        public Row(int i) {
            number = i;
        }
    }

    @Data
    private static class Tree<T> {
        private TreeNode<T> root;

        public Tree(T rootData) {
            root = new TreeNode<>(rootData);
        }
    }

    @Data
    private static class TreeNode<T> {
        public T data;
        public TreeNode<T> parent;

        public TreeNode(T data) {
            this.data = data;
        }
    }


}
