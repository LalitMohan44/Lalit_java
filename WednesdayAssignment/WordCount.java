package Lalit.Lalit_java.WednesdayAssignment;

import java.util.HashMap;

public class WordCount {

    public static void main(String args[]) {
        String s1 = "java string split method by java string split";
        wordCount(s1);
    }

    static void wordCount(String inputString)
    {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = inputString.split("\\s"); //splits the string based on whitespace

        for (String w : words) {

            if (wordCountMap.containsKey(w)) {
                wordCountMap.put(w, wordCountMap.get(w) + 1);
            }
            else {
                wordCountMap.put(w, 1);
            }
        }

        // Printing the wordCountMap
        System.out.println(wordCountMap);

    }

}
