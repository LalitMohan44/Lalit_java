package Lalit.Lalit_java.WednesdayAssignment;

import java.util.HashMap;

public class SecondWord {
    public static void main(String[] args)
    {
        String str = "abcbacd";
        SecondCount(str);
    }

    static void SecondCount(String inputString)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] strArray = inputString.toCharArray(); // Converting given string to char array
        int count=0;
        char second=' ';
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
                if(charCountMap.get(c)==2) {    //Check if it's count is 2
                    count++;
                    if(count==2) {              //check if its second character
                        second = c;
                        break;
                    }
                }
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        // Printing the charCountMap
        System.out.println(second);

    }


}


