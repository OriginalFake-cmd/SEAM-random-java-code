import java.util.Scanner;

class Book {
    private String name;
    private String author;
    private String publisher;
    private int year;

    public Book() {
    }

    public Book(String name, String author, String publisher, int year) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{name='" + name + "', author='" + author + "', publisher='" + publisher + "', year=" + year + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] bookList = null;

        while (true) {
            System.out.println("\nMenu Options:");
            System.out.println("1) Create new book list");
            System.out.println("2) Edit book");
            System.out.println("3) View books");
            System.out.println("4) Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter size of book list: ");
                    int listSize = Integer.parseInt(scanner.nextLine());
                    bookList = new Book[listSize];
                    for (int i = 0; i < listSize; i++) {
                        System.out.println("\nEnter details for book " + (i + 1) + ":");
                        System.out.print("Name: ");
                        String bookName = scanner.nextLine();
                        System.out.print("Author: ");
                        String bookAuthor = scanner.nextLine();
                        System.out.print("Publisher: ");
                        String bookPublisher = scanner.nextLine();
                        System.out.print("Year: ");
                        int bookYear = Integer.parseInt(scanner.nextLine());
                        bookList[i] = new Book(bookName, bookAuthor, bookPublisher, bookYear);
                    }
                    break;
                case 2:
                    if (bookList == null) {
                        System.out.println("No book list available.");
                        break;
                    }
                    System.out.print("Enter index of book to edit (1 to " + bookList.length + "): ");
                    int bookIndex = Integer.parseInt(scanner.nextLine()) - 1;

                    if (bookIndex < 0 || bookIndex >= bookList.length) {
                        System.out.println("Index out of range.");
                        break;
                    }

                    Book bookToEdit = bookList[bookIndex];
                    System.out.println("Editing " + bookToEdit);

                    System.out.print("New Name (leave blank to keep): ");
                    String newName = scanner.nextLine();
                    if (!newName.isEmpty()) {
                        bookToEdit.setName(newName);
                    }

                    System.out.print("New Author (leave blank to keep): ");
                    String newAuthor = scanner.nextLine();
                    if (!newAuthor.isEmpty()) {
                        bookToEdit.setAuthor(newAuthor);
                    }

                    System.out.print("New Publisher (leave blank to keep): ");
                    String newPublisher = scanner.nextLine();
                    if (!newPublisher.isEmpty()) {
                        bookToEdit.setPublisher(newPublisher);
                    }

                    System.out.print("New Year (0 to keep): ");
                    int newYear = Integer.parseInt(scanner.nextLine());
                    if (newYear != 0) {
                        bookToEdit.setYear(newYear);
                    }
                    break;
                case 3:
                    if (bookList == null) {
                        System.out.println("No book list available.");
                    } else {
                        System.out.println("\nCurrent Books:");
                        for (int i = 0; i < bookList.length; i++) {
                            System.out.println((i + 1) + ": " + bookList[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Select 1-4.");
            }
        }
    }
}
