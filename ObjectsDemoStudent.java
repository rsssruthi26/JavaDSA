public class ObjectsDemoStudent {

    /* Objects represent real world entities, they are basic unit of OOP. Consists of state, behaviour and identity*/

    String name;
    int age;
    static String university = "University of Akron!";
    long  id;
    int score;

     public ObjectsDemoStudent(String name, int age,  long id, int score){
        this.name = name;
        this.age = age;
        this.id = id;
        this.score = score;


    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getUniversity()
    {
        return university;
    }
    public long getId()
    {
        return id;
    }
    public int getScore()
    {
        return score;
    }
    public String toString()
    {
        return ("Hello I am  " + this.name + ". I am " + this.age + ". I am studying at " + university+  ". Score is "  +this.score);
    }


    public static void main(String[] args) {

        ObjectsDemoStudent student1 = new ObjectsDemoStudent("sruthi",25,  4795909, 99);
        ObjectsDemoStudent student2 = new ObjectsDemoStudent("veena", 23,  4791509, 100);
        ObjectsDemoStudent student3 = new ObjectsDemoStudent("waziha", 25,  4654533, 100);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());


    }





}
