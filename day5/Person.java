package day5;

//Task 1
public class Person {
    private String name;
    private int age;
    private String address;

    public Person() {
        super();
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void write() {
        System.out.println("Person's name: " + name + "\nAge: " + age + "\nAddress: " + address + "\n");
    }
}
