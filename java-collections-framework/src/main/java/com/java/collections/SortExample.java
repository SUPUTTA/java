package com.java.collections;

import java.util.*;

public class SortExample {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();
        num.add(2);
        num.add(25);
        num.add(4);
        num.add(1);
        num.add(9);
        num.add(65);
        num.add(35);
        num.add(6);
        for (Integer number : num)
            System.out.println("list before sorting" + number);
    }
}

