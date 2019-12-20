/**
 *
 */

public class Person {
    String name;
    int age;

    //constructor implicit
    public Person(){
        System.out.println("Constructorul implicit a fost apelat");
        this.name = "no name";
    }

    //constructor explicit
    public Person(String name){
        System.out.println("Constructorul explicit cu 1 parametru a fost apelat");
        this.name = name;
    }
}
