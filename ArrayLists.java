import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.*;
import java.util.Scanner;

/* Major Operations in LISTS:
Operation 1: Adding elements to List class using add() method
Operation 2: Updating elements in List class using set() method
Operation 3: Removing elements using remove() method

*
* */


public class ArrayLists {

    public static void main(String[] args) {

        //Collections new = new ArrayLists<>(); -> if we use collection we cannot mention the type of input, if its integer
        // or float or any type. It gives us a RUN TIME exception.

        List<Integer>  numbers =  new ArrayList<>(); //creating an object of list interface
// and it is implemented by array list class.

        //adding elements to the object.

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        List<Integer> l2 = new ArrayList<>(); // create an other arraylist
        l2.add(100);
        l2.add(200);
        l2.add(300);
        l2.add(300);
        l2.add(300);

        numbers.addAll(l2); // add elements of l2 to numbers

        System.out.println(numbers);

        numbers.remove(3); // removes the element present at index 3

        System.out.println(numbers);

        numbers.set(0,1000); // sets/ updates the value at index 0 to 1000

        System.out.println("Value at index 0 is: " + numbers.get(0)); // get() is used retrieve the elements needed not the full list

         // The index of the last occurrence of a specific element is either returned or -1 in case the element is not in the list

        System.out.println("Last Index of 300 is: " + numbers.lastIndexOf(300)); //returns last index
        System.out.println("Index of 300 is: "+ numbers.indexOf(300)); // return the first occurrence of the element



    }
}

