package lambdaExpressions;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        //Creating a function
        Function<String, String> convertstr = input -> input.toUpperCase();
        //calling a function method
        System.out.println("The UpperCase value of given input is: " + convertstr.apply("Eazy Bytes"));
        Function<String, String> sameValue = Function.identity();
        //calling function method
        System.out.println("The value of given input is: " + sameValue.apply("Eazy Bytes"));
        Function<Integer, Integer> multiplyOperation = a -> {
            System.out.println("Double Operation");
            return a * 2;
        };
        //Chaining the function methods using andThen()
        multiplyOperation = multiplyOperation.andThen(a -> {
            System.out.println("Triple Operation");
            return 3 * a;
        });
        System.out.println(multiplyOperation.apply(5));
        Function<Integer, Integer> divOperation = a -> {
            System.out.println("Division by 2 Operation");
            return a/2;
        };
        //Chaining the function methods using compose()
        divOperation = divOperation.compose(a -> {
            System.out.println("Division by 3 Operation");
            return a/3;
        });
        System.out.println(divOperation.apply(30));
    }
}
