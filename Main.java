package Lalit.Lalit_java;

public class Main {
    public static void main(String[] args) {

        String myString = "This is Lalit.";
        System.out.println("Hello World " + myString);

        for(int i=2; i<9; i++){
            System.out.println("10,000 at "+i+"% interest= "+ String.format("%.2f",calculateInterest(10_000,i)));
        }
    }
        public static double calculateInterest(double amount, double iRate){

        return(amount*(iRate/100));

    }
}
