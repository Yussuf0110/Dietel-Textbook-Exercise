package chapterFourteen;

public class ExtractBalloon {
    public static void main(String[] args) {


    }

    
    public static boolean checkForBalloon(String userInput) {

        int size = userInput.length();
        for (int i = 0; i < size / 2; i++) {
            if (userInput.charAt(i) != userInput.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
