import java.util.*;
/**
 * This programs shows how we can make an ArrayList Unmodifiable using, Collectons.unmodifiableList();
 */



public class UnmodifiableArrayList {
    public static void main(String[] args) throws Exception {
        try{
            // create object
            List<String> l = new ArrayList<>();

            l.add("Sai Satya Sruthi");
            l.add("Eminem");
            l.add("Arjit Singh");
            l.add("DSP");

            //display the sample list
            System.out.println("The initial list is: "+ l);
            //__________ unmodifiablelist____________

            List<String> read_only = Collections.unmodifiableList(l);

            //display the unmodifiable list
            System.out.println("Read_only list is: " + read_only);

            //trying to modify the list:
            System.out.println("Trying to modify the read_only list:--------------- ");

            read_only.add("Can i join this list?");



        }
        catch(UnsupportedOperationException e){
            System.out.println("The exception thrown is: " + e);

        }
    }
}
