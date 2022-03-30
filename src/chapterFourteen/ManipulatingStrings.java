package chapterFourteen;

import java.util.*;

public class ManipulatingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> stringArrayList = new ArrayList<>();

        System.out.println("Enter your input or '#' to end ");
        String userInput = input.nextLine();

        while (!Objects.equals(userInput, "#")){
            System.out.println("Enter your input or '#' to end ");
            userInput = input.nextLine();
            stringArrayList.add(userInput);





        }

        for (int i = 0; i <= stringArrayList.size(); i++) {

        }



        System.out.println(stringArrayList);



    }
}
