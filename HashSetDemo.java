/*
* Hashset implements Set interface.
* The underlying for Hashset is HASH TABLE
* Duplicates are not allowed.
* Objects that you insert in Hashset are not inserted in same order.
* Objects are inserted based on their hash code.
* NULL elements are allowed in Hashset
* Hashset implements Serializable and Cloneable interfaces.
*
* Initital Capacity: The number of buckets will be automatically increases if the bucket is full
* Load Factor: Load factor is a measure abut how full a HASHSET is allowed to get before its capacity is
* automatically increased.When the number of entries in the hash exceeds the product of the load factor and current
* capacity, the hash table is rehashed.
*                   Number of stored elements in table
* Load factor =    _______________________________________
*                       Size of the hash table
*
* LOAD FACTOR od 0.75 gives very effective performance wrt to time and space complexity.
*
* Internal working of Hashset: Hashset uses HashMap for storing objects internally.
* Storage in HashMap: The value we insert  in HashSet acts as a KEY  to the map Object  and for its value, Java uses
*   constant variable. So, in the key-value pair, all the values will be same.
* */

import java.sql.SQLOutput;
import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("Noodles");
        h.add("Munchurian");
        h.add("Fried Rice");
        h.add("Maggi");
        h.add("Manchow Soup"); // add elements
        h.add("Maggi");
        h.add("Maggi");

        System.out.println(h); //displaying the list // check if maggi is displayed 3 times: No! becoz no DUPLICATES

        h.remove("Maggi"); //remove an element


        System.out.println("Iterating elements using ITERATOR."); //ITERATOR
        Iterator<String> i = h.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }






    }
}
