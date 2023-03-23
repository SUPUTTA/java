package lambdaExpressions;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        lists.add("Mango");
        lists.add("Apple");
        lists.add("PineApple");
        System.out.println("ArrayList:");
        lists.forEach((e) -> {
            System.out.println(e + " , ");
        });
    }
}
