package chapterSix;

public class KataMethodII {

//    private int score = 0;

    public char setGrades(int score) {
        if (score < 40 && score > 0) {
        }
        else if (score > 39 && score < 50){
            return 'D';}
        else if (score > 49 && score < 70){
            return 'C';}
        else if (score > 69 && score < 90){
            return 'B';}
        else if (score > 89 && score < 100){
            return 'A';}
        else if (score < 0 && score > 100){
            return 'N';}
        return 'F';
    }


}

