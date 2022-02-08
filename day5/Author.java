package day5;

//Task 3
public class Author {
    private String name;
    private String email;
    private String gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }


    public void write() {
        System.out.println("Author name: " + name + "\nEmail: " + email + "\nGender: " + gender + ".\n");
    }
}

