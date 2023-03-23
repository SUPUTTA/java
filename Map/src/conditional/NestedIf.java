package conditional;

public class NestedIf {
    public static void main(String[] args) {
        int age = 25;
        int weight = 48;
        if (age>=18) {
            if (weight>50) {
                System.out.println("You are eligibile to Donate the Blood");
            } else {
                System.out.println("You are not eligible to Donate the Blood");
            }
        } else {
            System.out.println("Age must be greater than 18");
        }
    }
}
