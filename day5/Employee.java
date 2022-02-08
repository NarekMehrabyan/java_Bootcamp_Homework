package day5;

//Task 2
public class Employee {
    private int id;
    private String name;
    private String department;
    private int age;
    private String gender;

    public Employee(int id, String name, String department, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    public void write() {
        System.out.println("Employee id: " + id + "\nName: " + name + "\nDepartment: " + department
                + "\nAge: " + age + "\nGender: " + gender + ".\n");
    }
}
