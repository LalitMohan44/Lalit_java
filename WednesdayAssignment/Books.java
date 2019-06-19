package Lalit.Lalit_java.WednesdayAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class SortedBooks implements Comparable<SortedBooks> {

    String title;
    String category;
    int bookId;
    String author;


    public SortedBooks(int bookId,String title,String category,String author) {

        this.bookId= bookId;
        this.title = title;
        this.category= category;
        this.author= author;
    }

    public static class bookByAuthor implements Comparator<SortedBooks> {

        public int compare(SortedBooks o1, SortedBooks o2) {
            return o1.author.compareTo(o2.author);
        }
    }

    public int compareTo(SortedBooks o) {
        return this.bookId > o.bookId ? 1 : (this.bookId < o.bookId ? -1 : 0);
    }

    public String toString(){
        return String.valueOf(bookId);
    }

//    public void bookDetails(){
//        System.out.println("Book Title:"+title);
//        System.out.println("Book Category:"+category);
//
//
//    }
}

public class Books{

    public static void main(String args[]) {

        SortedBooks one= new SortedBooks(12345,"JAVA Made easy","Computer","Lalit");
        SortedBooks two= new SortedBooks(12365,"Python Made easy","Computer","Abhishek");

        List<SortedBooks> byAuthor= new ArrayList<>();
        byAuthor.add(one);
        byAuthor.add(two);

        Collections.sort(byAuthor, new SortedBooks.bookByAuthor());
        System.out.println("Sorted BookId by Author: "+byAuthor);



    }
}
