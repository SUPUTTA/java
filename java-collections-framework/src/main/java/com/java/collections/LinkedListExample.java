package com.java.collections;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Kedarnath");
        list.add("Badrinath");
        list.add("Kasi");
        list.add("Ladakh");
        list.add("Ayodhya");
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
