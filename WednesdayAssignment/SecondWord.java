package Lalit.Lalit_java.WednesdayAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SecondWord {
    public static void main(String[] args)
    {
        String str = "aaaeesfbcdbfs";
        SecondCount(str);
    }

    static void SecondCount(String inputString)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] strArray = inputString.toCharArray(); // Converting given string to char array
        System.out.println(strArray );
        int count=0;
        List<Character> list= new ArrayList<>();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
                if(charCountMap.get(c)==2){
                    list.add(c);
                }
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        for(char c:list){
            if(charCountMap.get(c)==2)
            {
                count++;
            }
            if(count==2) {
                System.out.println("Second character-2 times is: " + c);
                break;
            }
        }



    }


}


