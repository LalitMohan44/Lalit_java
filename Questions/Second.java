package Lalit.Lalit_java.Questions;

public class Second {

    public  static void main(String args[]){

        System.out.println("Prime numbers below 100 are:");
        for(int i=1;i<100;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+", ");
            }
        }
    }

    public static boolean isPrime(int n){

        if(n==1)
            return false;

        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }

        return true;
    }
}
