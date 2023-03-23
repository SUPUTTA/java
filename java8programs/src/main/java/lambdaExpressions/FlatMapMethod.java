package lambdaExpressions;


import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapMethod {
    public static void main(String[] args) {
        String[] arrayOfWords = {"Eazy", "Bytes"};
        Stream<String> streamOfwords = Arrays.stream(arrayOfWords);
        streamOfwords
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);


    }
}
