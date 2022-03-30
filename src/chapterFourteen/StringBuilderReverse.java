package chapterFourteen;

import java.util.List;

public class StringBuilderReverse {
    public static void main(String[] args) {
        String word = "Balloon";

        StringBuilder reverse = new StringBuilder(word);

        reverse.reverse();

        String answer = reverse.toString();

        System.out.println(answer);

        String newWord = "Ada   mu";
        System.out.println(newWord.replaceAll(" ",""));

//
//        String indexWord = "Mississipi";
//
//
//        for(int i = 0; i <= indexWord.length(); i++) {
//
//
//        }


    }
}
