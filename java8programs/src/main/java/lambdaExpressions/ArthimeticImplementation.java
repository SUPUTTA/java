package lambdaExpressions;

public class ArthimeticImplementation {
    public static void main(String[] args) {
        int firstInt = 10, secondInt = 6;
        ArthimeticOperation oldsum = new ArthimeticOperation() {
            @Override
            public int performOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println("The sum of two input integers without lambda is:" +oldsum.performOperation(firstInt, secondInt));
        ArthimeticOperation sum = (a , b) -> a + b;
        ArthimeticOperation multiply = (a, b) -> a * b;
        ArthimeticOperation sub = (a, b) -> a - b;

        System.out.println("The sum of two integers is: " + sum.performOperation(firstInt, secondInt));
        System.out.println("The multiplication of two integers is: " + multiply.performOperation(firstInt, secondInt));
        System.out.println("The subtraction of two integers is: " + sub.performOperation(firstInt, secondInt));

    }
}
