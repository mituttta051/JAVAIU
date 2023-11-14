package week7;

class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book{" +
                "name = '" + name + '\'' +
                ", author = " + author +
                ", price = " + price +
                ", qty = " + qty +
                '}';
    }
}

class Author {
    private String name, email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name = '" + name + '\'' +
                ", email = '" + email + '\'' +
                ", gender = " + gender +
                '}';
    }
}

class Library{
    Book[] arr;

}
public class Ex2 {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        Author author = new Author("Leo Tolstoy", "email", 'm');
        books[0] = new Book("Война и мир", author, 1000);
        books[1] = new Book("Анна Каренина", author, 100);
//        bookarray[0].setPrice(1000);
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }

    }
}
