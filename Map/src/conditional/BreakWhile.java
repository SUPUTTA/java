package conditional;

public class BreakWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i == 10) {
                i++;
                break;
            }
            System.out.println(i);
            i++;
        } while (i <= 10); {

        }
    }
}
