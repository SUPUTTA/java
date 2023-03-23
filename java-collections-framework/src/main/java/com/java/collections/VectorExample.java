package com.java.collections;

import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Mango");
        v.add("Apple");
        v.add("Pine Apple");
        v.add("Kiwi");
        v.add("Custord Apple");
        Iterator<String> itr = v.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
