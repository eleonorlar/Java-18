public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Ana";
        System.out.println(person1.name);

        Person person2 = new Person("Bogdan");
        System.out.println(person2.name);

    }
}
