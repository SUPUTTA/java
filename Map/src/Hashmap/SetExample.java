package Hashmap;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> marvel_movies = new LinkedHashSet<String>();
        marvel_movies.add("Doctor Strange");
        marvel_movies.add("The Hound of Baskerville");
        marvel_movies.add("Vamphire");
        marvel_movies.add("The Stranger Things");
        System.out.println(marvel_movies);
    }

}
