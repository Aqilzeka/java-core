package interview;

import java.io.*;

public class TransientTest {
    public static void main(String[] args) {
        Book test = new Book(1,"Test","unknown",2);
        System.out.println("Before Serialization: " + test);

        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(test);

            System.out.println("Book is successfully Serialized ");

            FileInputStream fis = new FileInputStream("test.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Book oldNarnia = (Book) ois.readObject();

            System.out.println("Book successfully created from Serialized data");
            System.out.println("Book after serialization : " + oldNarnia);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Book implements Serializable {
    private final int id;
    private final String title;
    private final String author;
    private transient int edition = 1; //transient variable not serialized

    public Book(int id, String title, String author, int edition) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Book{" + "ID=" + id + ", title=" + title + ", author=" + author + ", edition=" + edition + '}';
    }

}