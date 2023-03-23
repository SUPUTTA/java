package lambdaExpressions;

@FunctionalInterface
public interface ArthimeticOperation {
    public int performOperation(int a , int b); //valid functional interface as it contains only one SAM

    public default void performAdd(int a,int b) {
        int res = addTwoNum(a, b);
        printTheInput(res);
    }

    private int addTwoNum(int a, int b) {
        return a + b;
    }
    public static void printTheInput(int res) {
        System.out.println(res);
    }
}
