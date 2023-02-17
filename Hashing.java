import java.util.*;

/*
* HashTable - it is a data structure that stores key-values pairs.
*           * Used for fast insertion, deletion and lookup
*           * Ideal for LARGE data sets not for small Data sets.
* Hashing: Takes a key and computes an integer.
* Bucket: can store multiple entries in case of collision
* Collision: hash function generates same index for one or more key.  Less Collision  = more Efficiency.
* Time Complexity : Best case O(1), worst case O(n);
* By default the capacity if 11.
* */

public class Hashing {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>(11);
        ht.put(10, "Sruthi");
        ht.put(21,"Satya");
        ht.put(33,"Sai");
        ht.put(46,"Reddy");
        for(Integer i: ht.keySet())
        System.out.println("Key is: " + i + " " +" Value is: "+ht.get(i) + "    Hashcode is: "+ i.hashCode()%11);
    }
}
