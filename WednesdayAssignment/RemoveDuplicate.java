package Lalit.Lalit_java.WednesdayAssignment;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String args[]) {

        Map<Integer, Book> map = new HashMap<>();

        Book one = new Book(12345,"JAVA","Computer","Lalit");
        Book two = new Book(12365, "Python", "Computer", "Mohan");
        Book three = new Book(12345,"JAVA","Computer","Lalit");

        map.put(1, one);
        map.put(2, two);
        map.put(3, one);

        System.out.println("Removing Duplicate in HashMap  ");

        //Removing duplicate in HashMap
        Collection<Book> list = map.values();
        for(Iterator<Book> itr = list.iterator(); itr.hasNext();)
        {
            if(Collections.frequency(list, itr.next())>1)
            {
                itr.remove();
            }
        }
        for (Map.Entry<Integer, Book> entry:map.entrySet()){
            Book b = entry.getValue();
            System.out.println(b.author+" "+b.title);
        }

        //Removing by HashSet
        System.out.println("Removing Duplicate in Hashset using hashCode and equals ");
        HashSet<Book> set = new HashSet();
        set.add(one);
        set.add(two);
        set.add(three);


        for(Book b:set ) {
            System.out.println(b.author+" "+b.title);
        }


    }
}

class Book {
    String title;
    String category;
    int bookId;
    String author;


    public Book(int bookId,String title,String category,String author) {

        this.bookId= bookId;
        this.title = title;
        this.category= category;
        this.author= author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId &&
                Objects.equals(title, book.title) &&
                Objects.equals(category, book.category) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, category, bookId, author);
    }

}