package Lalit.Lalit_java.Questions;

enum Day
    {
        Sun, Mon, Tue, Wed, Thu, Fri, Sat;
    }

public class Eighth {

    Day day;
         public Eighth(Day day)
        {
            this.day = day;
        }
    public void witchdDay()
    {
        switch (day)
            {
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                case Tue:
                    System.out.println("Tuesday");
                    break;
                case Wed:
                    System.out.println("Wednesday");
                    break;
                case Thu:
                    System.out.println("Thursday");
                    break;
                case Fri:
                    System.out.println("Friday");
                    break;
                case Sat:
                    System.out.println("Saturday");
                    break;
            }
        }

        public static void main(String args[])
        {
            String str= "Sun";
            Eighth c1=new Eighth(Day.valueOf(str));
            c1.witchdDay();
        }
}
