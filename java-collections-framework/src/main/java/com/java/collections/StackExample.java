package com.java.collections;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("friends");
        stack.push("enemies");
        stack.push("relations");
        stack.push("emotions");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
