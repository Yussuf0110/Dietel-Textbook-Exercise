package chapterSixteen;

import java.io.*;
import java.util.*;

public class CountingLetters {
    public static void main(String[] args) {

        String userInput = "thsbs";
        characterCount(userInput);

        }

    public static void characterCount(String userInput) {

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();


        char[] strArray = userInput.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {

                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {


                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    }

