package Lalit.Lalit_java;

public class Calc {
    public static void main(String[] args){

        int highScore=calculateHighScore(1500);
        displayHighScore("Lalit",highScore);

        highScore=calculateHighScore(900);
        displayHighScore("Mohan",highScore);

        highScore=calculateHighScore(400);
        displayHighScore("Rajat",highScore);

        highScore=calculateHighScore(50);
        displayHighScore("Bob",highScore);
    }

    public static  int calculateHighScore(int score){

        if(score>1000)
            return 1;
        else if(score>500 && score<1000)
            return 2;
        else if(score>100 && score<500)
            return 3;
        else
            return 4;

    }

    public static  void displayHighScore(String name,int highScore){
        System.out.println(name+" managed to get "+highScore);
    }
}
