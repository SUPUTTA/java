package lambdaExpressions;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        //creating a supplier
        Supplier<Integer> getCurrDayOfMonth = () -> LocalDate.now().getDayOfMonth();
        //invoking a get method inside the supplier
        System.out.println("Today's day of the month is: " + getCurrDayOfMonth.get());
        //creating a supplier
        Supplier<String> getCurrDay = () -> LocalDate.now().getDayOfWeek().name();
        //invoking a get method inside the supplier
        System.out.println("Today's day is: "+getCurrDay.get());
    }
}
