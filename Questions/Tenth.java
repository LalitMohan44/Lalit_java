package Lalit.Lalit_java.Questions;

public class Tenth {

    public static void main(String args[]){
        two o=new two();
        o.print_vande();
        o.print_matram();
    }

}

class one
{
    public void print_vande()
    {
        System.out.print("Vande ");
    }
}

class two extends one
{
    public void print_matram()
    {
        System.out.println("Mataram ");
    }
}