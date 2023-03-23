package lambdaExpressions;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> convertAndDisplay = input -> System.out.println("Converted value is: " +input.toUpperCase());
        //invoking accept method inside the consumer
        convertAndDisplay.accept("Eazy Bytes");

        //creating a consumer
        Consumer<String> appendInput = input -> System.out.println("New value after appending is: "+ "Hello "+input);
        //invoking method inside the consumer
        appendInput.andThen(convertAndDisplay).accept("Java 8");
    }
}
