package Lalit.Lalit_java.Questions;

public class Sixth {

    public static int countWords(String s)
    {
        int c=1;
        for (int i = 0; i < s.length() - 1; i++)
        {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
            {
                c++;

            }
        }
     return c;
    }


    public static void main(String[] args) {
        String string ="this is example for string token or delimeter using split method you can split";
        System.out.println("String has "+countWords(string) + " words.");
    }

}
