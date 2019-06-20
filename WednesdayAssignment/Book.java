package Lalit.Lalit_java.Library_Managment.src.Books;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import static java.time.temporal.ChronoUnit.DAYS;


public class Book {

    String title;
    String category;
    int bookId;
    String author;
    String issueD;
    String returnD;



    public Book(int bookId,String title,String category,String author , String issueD, String returnD) {

        this.bookId= bookId;
        this.title = title;
        this.category= category;
        this.author= author;
        this.issueD= issueD;
        this.returnD= returnD;
    }


    public LocalDate toLocalDate(String date){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate ldate = LocalDate.parse(date, dateFormat);

        return ldate; }

    public long fineCal(){          //fine calculation
        LocalDate issueDate=toLocalDate(issueD);
        LocalDate returnDate=toLocalDate(returnD);
        long daysBetween,fine;
        daysBetween = DAYS.between(issueDate,returnDate);

        if(daysBetween<15)
        {
            fine=10;
            return fine;
        }
        else{
            long extraDays=daysBetween-15;
            if(extraDays<10) {
                fine=10+extraDays*2;
                return fine;
            }
            else if(extraDays<20){
                fine=10+10*2+(extraDays-10)*5;
                return fine;
            }
            else if(extraDays<30){
                fine=10+10*2+10*5+(extraDays-20)*100;
                return fine;
            }
            else
                fine=10+10*2+10*5+10*100+(extraDays-30);
            return fine;
        }

    }

    public void bookDetails(){
        System.out.println("Book Title:"+title);
        System.out.println("Book Category:"+category);

        System.out.println("Book Issue Date;"+issueD);
        System.out.println("Book Return Date;"+returnD);
        System.out.println("Fare:"+fineCal());

    }
}

class AddBook{

    public static void main(String args[]) {

        Map<Integer,Book> map=new HashMap<Integer,Book>();
        Book one= new Book(12345,"JAVA Made easy","Computer","Lalit","3/3/2019","4/3/2019");
        Book two= new Book(12365,"Python Made easy","Computer","Mohan","10/3/2019","1/3/2019");

        map.put(1,one);
        map.put(2,two);
        for(Map.Entry<Integer, Book> entry:map.entrySet()){
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println("Book "+key+" Details:");
            System.out.println(b.bookId+","+b.title+","+b.author+","+b.category);
        }

    }
}
