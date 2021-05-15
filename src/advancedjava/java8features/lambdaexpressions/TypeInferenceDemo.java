package advancedjava.java8features.lambdaexpressions;

public class TypeInferenceDemo {
    public static void main(String[] args) {

        /*
        Here, When we are using "StringLengthLambda" type to assign the lambda expression "phrase -> phrase.length()"
        to the variable "stringLengthLambda", The Java compiler infers/matches the return type of lambda expression
        and parameter based on the operation performed on the parameter.
        It figures out the type of parameter from the interface.
         */
        StringLengthLambda stringLengthLambda = phrase -> phrase.length();
//        StringLengthLambda stringLengthLambda = (String phrase) -> phrase.length();
//        StringLengthLambda stringLengthLambda = String::length; // using method reference
        System.out.println(stringLengthLambda.getLength("Lambda Expression"));

        /*
        The lambda expression "phrase -> phrase.length()" can go into a method argument if you have a method
        which takes the type "stringLengthLambda"
         */
        //TODO: get clarity.
        printLambda(s -> s.length());

    }


    public static void printLambda(StringLengthLambda lambda) {
        System.out.println(lambda.getLength("Hello Lambda"));
    }

}

interface StringLengthLambda {
    int getLength(String phrase);
}
