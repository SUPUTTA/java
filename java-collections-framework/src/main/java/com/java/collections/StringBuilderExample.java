package com.java.collections;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Small String ");
        System.out.println("Capacity is: " + str.capacity());
        str.append("now becomes big");
        System.out.println("Capacity is: " + str.capacity());
        str.ensureCapacity(13);
        System.out.println("Capacity is: " + str.capacity());
        str.ensureCapacity(40);
        System.out.println("Capacity is: " + str.capacity());
    }
}
