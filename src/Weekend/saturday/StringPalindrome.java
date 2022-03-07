package Weekend.saturday;

import java.util.Scanner;

public class StringPalindrone {


        static int longestPalSubstr(String userInput) {
            int n = userInput.length();
            if (n < 2)
                return n;

            int maxLength = 1;
            int start = 0;
            int low;
            int high;

            for (int i = 0; i < n; i++) {
                low = i - 1;
                high = i + 1;

                while (high < n && userInput.charAt(high) == userInput.charAt(i))
                    high++;

                while (low >= 0 && userInput.charAt(low) == userInput.charAt(i))
                    low--;

                while (low >= 0 && high < n && userInput.charAt(low) == userInput.charAt(high)) {
                    low--;
                    high++;
                }

                int length = high - low - 1;
                if (maxLength < length) {
                    maxLength = length;
                    start = low + 1;
                }
            }
            System.out.print("Longest palindrome substring is: ");
            System.out.println(userInput.substring(start, start + maxLength));
            return maxLength;
        }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the letters you want to check it's palindrone");
        String input = scanner.next();
        System.out.println("Length is: "
                + longestPalSubstr(input));
    }
}

