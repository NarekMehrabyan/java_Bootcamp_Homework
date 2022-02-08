package day5;

//Task 4
public class Book {
    private String name;
    private String author;
    private int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void write() {
        System.out.println("Book name: " + name + "\nAuthor: " + author + "\nPrice: " + "$" + price + ".\n");
    }
}
