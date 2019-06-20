package Lalit.Lalit_java.WednesdayAssignment;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String args[]) {

        Map<Integer, Book> map = new HashMap<>();

        Book one = new Book(12345,"JAVA","Computer","Lalit");
        Book two = new Book(12365, "Python", "Computer", "Mohan");

        map.put(1, one);
        map.put(2, two);
        map.put(3, one);

        System.out.println("HashMap with duplicate Books: "+map);

        //Removing duplicate in HashMap
        Collection<Book> list = map.values();
        for(Iterator<Book> itr = list.iterator(); itr.hasNext();)
        {
            if(Collections.frequency(list, itr.next())>1)
            {
                itr.remove();
            }
        }
        System.out.println("HashMap without duplicate Books: "+map);

        //Removing by HashSet
        HashSet set = new HashSet();
        set.add(one);
        set.add(two);
        set.add(one);       //HashSet will not take duplicate objects

        System.out.println(set);



    }
}

class Book{
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

}