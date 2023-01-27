import java.util.ArrayList;
import java.util.*;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }
    public String getName()
    {
        return name;
    }
    public Integer getAge(){
        return age;
    }


}

public class MethodReferences1StaticMethod {

    public static int compareByName(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }
    public static int compareByAge(Person a, Person b){
        return a.getAge().compareTo(b.getAge());
    }

    public static void main(String args[]){
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Sruthi", 25));
        personList.add(new Person("Chandu", 30));
        personList.add(new Person("Padma", 57));
        personList.add(new Person("Vamshi", 27));

        //using static METHOD REFERENCE

        Collections.sort(personList, MethodReferences1StaticMethod::compareByName); //second parameter.

        System.out.println("Sort the list by name: ");

        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        Collections.sort(personList, MethodReferences1StaticMethod::compareByAge); //second parameter.

        System.out.println("Sort the list by age : ");

        personList.stream()
                .map(x -> x.getAge())
                .forEach(System.out::println);





    }

}
