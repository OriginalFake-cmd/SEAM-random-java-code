public class MyClass {
    public static void main(String args[]) {
        Book superCars = new Book("9780306406157", "The Science of Supercars", "John Morisson", "Cars", true);
        System.out.println(superCars.getIsbn());
          
    }
}

class Book {
    private String isbn;        
    private String title;
    private String author;
    private String genre;
    private boolean isCheckedOut;

    public Book(String isbn, String title, String author, String genre, boolean isCheckedOut) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isCheckedOut = isCheckedOut;
    }

    public String getIsbn() {
        return isbn;
    }
}
