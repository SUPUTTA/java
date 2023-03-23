package lambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        //Creating a predicate
        Predicate<Integer> isEven = i -> i % 2 == 0;
        //calling predicate method
        System.out.println("is the number 61 is even?:" + isEven.test(61));
        //creating a predicate
        Predicate<Integer> isGreaterThan50 = i -> i > 50;
        //Calling AND Chaining
        System.out.println(
                "is the number 61 is even & greater than 50 ?:" + isGreaterThan50.and(isEven).test(61));
        //Calling OR Chaining
        System.out.println(
                "is the number 61 is even or greater than 50 ?:" + isGreaterThan50.or(isEven).test(61));
        //Predicate negate Chaining
        System.out.println("" +
                "is the number 61 is odd?:" + isEven.negate().test(61));

        //usage of predicate inside Collections & Streams
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> collect = list.stream().filter(isEven).collect(Collectors.toList());
        System.out.println("List of even numbers from the given list: " +collect); //[2,4,6,8,10]
        Predicate<String> checkEquality = Predicate.isEqual("Eazy Bytes");
        System.out.println("Is the input string is equal ? : " + checkEquality.test("Easy Bytes"));
    }
}
