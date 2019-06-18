package Lalit.Lalit_java.Questions;

import java.math.BigDecimal;

public class Fifth {

    public static void main(String args[])
    {
        BigDecimal bd1,bd2,bd3;
        bd1=new BigDecimal("123456");
        bd2=new BigDecimal("343652");

        bd3=bd1.add(bd2);

        System.out.println("Sum is:"+bd3);

    }
}
