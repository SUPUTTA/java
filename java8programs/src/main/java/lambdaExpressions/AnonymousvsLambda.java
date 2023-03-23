package lambdaExpressions;

public class AnonymousvsLambda {

    int sum = 0;
    public void sum() {
        int tempSum = 0;
        ArthimeticOperation sumOperation = (a , b)-> {
            int sum = 0;
            //temp sum = 0; //compilation error
            this.sum = a + b;
            System.out.println("The value of sum inside lambda is: " + sum);
            return this.sum;
        };
        System.out.println("The sum of given two numbers is: "+sumOperation.
                performOperation(10, 20));
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        AnonymousvsLambda lambda = new AnonymousvsLambda();
    }

}
