package conditional;

public class Continue {
    public static void main(String[] args) {
        //it continues the current flow of the program and skips the remaining code at the specific condition.
        // In case of an inner loop, it continues the inner loop only,
        // it is used when you need to jump to the next iteration of the loop immediately
        for(int i=1; i<=10; i++) {
            if(i==5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
