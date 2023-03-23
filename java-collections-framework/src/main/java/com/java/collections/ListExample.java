package com.java.collections;

import java.util.*;

public class ListExample {
            public static void main(String[] args) {
                List<Integer> list = new ArrayList<Integer>();
                //Adding elements in the List
                list.add(13);
                list.add(15);
                list.add(16);
                list.add(17);
                //Iterating the List element using for-each loop
                for (Integer number: list)
                System.out.println(list);

            }
        }

