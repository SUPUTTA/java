package lambdaExpressions;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> listObject = new ArrayList<String>();
        listObject.add("India");
        listObject.add("Australia");
        listObject.add("Canada");
        listObject.add("Dallas");
        listObject.add("USA");
        Iterator it  = listObject.iterator();
        while(it.hasNext());
        {
            System.out.println(it.next());
        }
    }
}
