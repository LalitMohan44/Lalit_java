package Lalit.Lalit_java.WednesdayAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Search {

    String title;
    String category;
    int bookId;
    String author;

    public Search(int bookId,String title,String category,String author ) {

        this.bookId= bookId;
        this.title = title;
        this.category= category;
        this.author= author;
    }



}

class AddBook{

    public static void main(String args[]) {

        Map<Integer, Search> map=new HashMap<>();
        Search one= new Search(12345,"JAVA","Computer","Lalit");
        Search two= new Search(12365,"Python","Computer","Mohan");

        map.put(1,one);
        map.put(2,two);

        Scanner s=new Scanner(System.in);
        System.out.println("Give Book Title:");
        String title=s.nextLine();
        s.close();
        for(Map.Entry<Integer, Search> entry:map.entrySet()) {
            Search b = entry.getValue();
            if(title.equals(b.title))
            {
                System.out.println(b.bookId+","+b.title+","+b.author+","+b.category);
            }
        }

    }

}

