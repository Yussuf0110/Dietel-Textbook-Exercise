package chapterThree;

public class Multiple {

    public static boolean isMultiple(int x,int y){
        double division = y%x;
        double division2 = x%y;
        boolean answer;
        if (division == 0 || division2 == 0){
            answer = true;
        }
        else
        {
            answer = false;
        }
        return answer ;
    }
}
