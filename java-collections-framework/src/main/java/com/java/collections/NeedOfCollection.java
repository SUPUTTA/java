package com.java.collections;

import java.util.*;

public class NeedOfCollection {
    public static void main(String[] args) {
        ArrayList<String> putta = new ArrayList<String>(); //creating ArrayList
        putta.add("Janardhana Rao.P");
        putta.add("Subba Lakshmi.P");
        putta.add("Venu Gopal.P");
        putta.add("Sudha Sravani.P");
        Iterator itr = putta.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
