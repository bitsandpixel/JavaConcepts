package advancedjava.java8features.LambdaExpressions;

public class TypeInferenceDemo {
    public static void main(String[] args) {

        StringLengthLambda stringLengthLambda = phrase -> phrase.length();
        System.out.println(stringLengthLambda.getLength("Lambda Expression"));
    }

}

interface StringLengthLambda {
    int getLength(String phrase);
}
