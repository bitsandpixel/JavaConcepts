package advancedjava.java7features.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vishnu Kandanelly
 */
public class BBQ {

    public static void main(String[] args) {

        Queue<String> bbqLine = new LinkedList<>();
        /*adding people to line*/
        bbqLine.add("Jackson");
        bbqLine.add("Tyreek");
        bbqLine.add("Susan");
        System.out.println("people in the line: " + bbqLine);
        System.out.println(bbqLine.peek() + " is in the front of the line");
        System.out.println("How many people are in the line: " + bbqLine.size());
        System.out.println("is Walter is the line? - " + bbqLine.contains("Walter"));
        /*people leaving the line*/
        if (!bbqLine.isEmpty()) {
            System.out.println(bbqLine.poll());
            System.out.println("remaining people in the line: " + bbqLine);
        }
        if (!bbqLine.isEmpty()) {
            System.out.println(bbqLine.poll());
            System.out.println("remaining people in the line: " + bbqLine);
        }
        if (!bbqLine.isEmpty()) {
            System.out.println(bbqLine.poll());
            System.out.println("remaining people in the line: " + bbqLine);
        }
        if (!bbqLine.isEmpty()) {
            /*returns null if Queue is empty*/
            System.out.println(bbqLine.poll());
        }
    }
}
