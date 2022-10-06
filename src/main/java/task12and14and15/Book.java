package main.java.task12and14and15;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;

    public static Comparator<Book> nameComparator = Comparator.comparing(o -> o.title);

    public static Comparator<Book> nameAndAuthorComparator = (o1, o2) -> nameComparator.compare(o1, o2) == 0
            ? o1.author.compareTo(o2.author)
            : nameComparator.compare(o1, o2);

    public static Comparator<Book> authorAndNameComparator = (o1, o2) -> o1.author.compareTo(o2.author) == 0
            ? nameComparator.compare(o1, o2)
            : o1.author.compareTo(o2.author);

    public static Comparator<Book> authorAndNameAndPriceComparator = (o1, o2) -> authorAndNameComparator.compare(o1, o2) == 0
            ? Integer.compare(o1.price, o2.price)
            : authorAndNameComparator.compare(o1, o2);
    private String isbn;
    private String author;
    private int price;
    private static int edition;

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }


    @Override
    public String toString() {
        return "Book:{\n" +
                "title='" + title + '\n' +
                ", isbn='" + isbn + '\n' +
                ", author='" + author + '\n' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (title == null ? 0 : title.hashCode());
        result = 31 * result + (author == null ? 0 : author.hashCode());
        result = 31 * result + price;
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book book = (Book)super.clone();
        book.author = this.author;
        book.price = this.price;
        book.title = this.title;
        return book;
    }
}
