package myjava.languagebasics.controlflowstatements;

import java.util.Scanner;

/**
 * @author Vishnu Kandanelly
 */
public class forLoopDemo {
    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        longestName(console, 5);
//        println();
        printAsciiValues();
    }

    public static void printAsciiValues() {

        System.out.println("Printing Ascii values:");
        System.out.printf("Ascii values are of size 7 bits%n"
                + "so 2^7 = 128 ranges from 0-127%n");
        for (int i = 0; i < 128; i++) {
            System.out.printf("%d: %c%n", i, i);
        }

    }

    public static void println() {
        for (int i = 10; i > 0; i--) {
            for (int j = i; j <= 10; j++) {
//                if(i%2==0){
//                    break;
//                }
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
//                if(i%2==0){
//                    break;
//                }
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        int length = 9;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j < length) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }
            length--;
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                if (j < i) {
//                if (j >= i) {
                    System.out.print("  ");
//                    System.out.print("* ");
                    continue;
                }
                System.out.print("* ");
//                System.out.print("  ");
            }
            System.out.println("");
        }

        /**
         * Labelled break point.
         */
        outerLoop:
        for (int i = 0; i < 10; i++) {
            innerLoop:
            for (int j = 0; j < 10; j++) {
                if (i % 2 == 0) {
                    if (i == 10) {
                        break outerLoop;
                    }
                    System.out.print("  ");
                    break innerLoop;
                }
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void longestName(Scanner console, int names) {

        String longest = "";
        boolean tie = false;

        for (int i = 1; i <= names; i++) {
            System.out.print("name #" + i + "? ");
            String name = console.nextLine();
            if (name.length() == longest.length()) {
                tie = true;
            } else if (name.length() > longest.length()) {
                tie = false;
                longest = name;
            }
        }
        longest = longest.substring(0, 1).toUpperCase() + longest.substring(1).toLowerCase();
        ;
        System.out.println(longest + "'s name is the longest");
        if (tie) {
            System.out.println("(There was a tie!)");
        }
    }

//    public static void longestName(Scanner console, int num) {
//    String longest = "";
//    boolean tie = false;
//    for(int i = 1; i <= num; i++) {
//        System.out.print("name #" + i + "? " );
//        String name = console.next();
//        if(name.length() == longest.length()) {
//            tie = true;
//        } else if(name.length() > longest.length()) {
//            tie = false;
//            longest = name;
//        }
//    }
//    String capitalized = longest.substring(0, 1).toUpperCase() +
//                         longest.substring(1).toLowerCase();
//    System.out.println(capitalized + "'s name is longest");
//    if(tie)
//        System.out.println("(There was a tie!)");
//}
    /*
    public static void longestName(Scanner console, int numOfNames) {
    System.out.print("name #1? ");
    String name = console.next();
    boolean tie = false;
    int maxLength = name.length();
    String longestName = name.toLowerCase();

    for (int i = 2; i <= numOfNames; i++) {
        System.out.printf("name #%d? ", i);
        name = console.next();
        if (name.length() > maxLength) {
            maxLength = name.length();
            longestName = name.toLowerCase();
            tie = false;
        } else if (name.length() == maxLength){
            tie = true;
        }
    }

    longestName = longestName.substring(0,1).toUpperCase() + longestName.substring(1);
    System.out.println(longestName + "'s name is longest");

    if (tie == true) {
        System.out.println("(There was a tie!)");
    }
}*/
}
