package Hashmap;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        //LinkedHashMap<K,V>
        LinkedHashMap<Integer, String> Employee = new LinkedHashMap<>();
        Employee.put(1, "Sudha is a Backend Developer");
        Employee.put(2, "Sravani is a FrontEnd Developer");
        Employee.put(3, "Chandu is a DotNet Developer");
        Employee.put(4, "Rutuja is a Tester");
        Employee.put(5, "VenuGopal is a Assistant Lecturer");
        System.out.println("The Employee details is:-" + Employee.size());
        //System.out.println(Employee);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int id = sc.nextInt();
        if (Employee.containsKey(id)) {
            String name = Employee.get(id);
            System.out.println("The Employee Details of ID:-" + name);
            //String name = Employee.get(4);
            //System.out.println("The Employee details of ID 4 is:-" +name);
        } else {
            System.out.println("The Employee Details of ID is not found");
        }
    }
}

