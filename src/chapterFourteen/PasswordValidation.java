package chapterFourteen;

public class PasswordValidation {

    public static boolean checkPasswordLength(String password){
        int min = 8;
        int max = 16;

        return password.length() >= min && password.length() < max;
    }

    public static boolean checkFirstLetterIsAnAlphabet(String password){
        return Character.isLetter(password.charAt(0));
    }

    public static boolean checkUpperCase(String password){
        int upperCaseCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))){
                upperCaseCount++;
            }
        }
        return upperCaseCount >= 1;
    }

    public static boolean checkNumberAvailable(String password){
        int numberCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))){
                numberCount++;
            }
        }
        return numberCount >= 1;
    }


    public static void main(String[] args) {
        String input = "Arr#yyyooP2ww";
        System.out.println(input.length());

        if(checkPasswordLength(input) && checkFirstLetterIsAnAlphabet(input) && checkUpperCase(input) && checkNumberAvailable(input)){
            System.out.println("Password valid");
        }
        else
        {
            System.out.println("Invalid password");
        }
    }
}
