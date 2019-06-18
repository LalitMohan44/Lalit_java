package Lalit.Lalit_java.Questions;

 class Super {
    public void display() throws RuntimeException { // Super class declare an exception

        System.out.println("This is Parent Class");
    }
}

 public class First extends Super {
    public void display() throws ArithmeticException { //Sub Class(First) needs to declare a child exception or same
                                                       // but not a broader exception of RuntimeException
        System.out.println("This is Child Class");
    }

    public  static void main(String args[]){
        Super c= new First();
        c.display();
    }
}
