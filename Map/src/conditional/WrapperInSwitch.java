package conditional;

import java.util.*;
public class WrapperInSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age:");
        Integer age = sc.nextInt();

        switch(age) {
            case(16): System.out.println("Age should be under 18");
            break;
            case(18): System.out.println("You are eligible for vote");
            break;
            case(65): System.out.println("You are senior citizen");
            break;
            default: System.out.println("Please give the valid age");
            break;
        }
    }
}
