package day5;

public class Main {
    public static void main(String[] args) {
//        Task 1
        Person first = new Person("Vardan", 26, "c. Gyumri.");
        Person second = new Person("Anna", 21, "c. Yerevan.");

        first.write();
        second.write();

//      Task 2
        Employee one = new Employee(123562, "Ara", "Finance", 35, "Male");
        Employee two = new Employee(123216, "Karen", "Marketing", 32, "Male");
        Employee three = new Employee(123451, "Hayk", "Marketing", 28, "Male");
        Employee four = new Employee(122543, "Saten", "Marketing", 27, "Female");
        Employee five = new Employee(124562, "Karine", "Sales", 30, "Female");

        one.write();
        two.write();
        three.write();
        four.write();
        five.write();

//        Task 3
        Author avo = new Author("Avetiq", "avo1980@yandex.ru", "Male");
        Author art = new Author("Artak", "art1975@yandex.ru", "Male");
        Author eva = new Author("Eva", "eva1988@yandex.ru", "Female");

        avo.write();
        art.write();
        eva.write();

//        Task 4
        Book b1 = new Book("The maid", "Nita Prose", 23);
        Book b2 = new Book("The Lincoln highway", "Amor Towles", 30);
        Book b3 = new Book("Greenlights", "Matthew McConaughey", 25);

        b1.write();
        b2.write();
        b3.write();
    }
}
