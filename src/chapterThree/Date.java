package chapterThree;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int aDay, int aMonth, int aYear){
        if(aDay > 0 &&  aDay < 32) {
            this.day = aDay;
        }

        if (aMonth > 0 && aMonth < 13){
        this.month = aMonth;
}

        this.year = aYear;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int aDay) {
        if(aDay > 0 &&  aDay < 32) {
            this.day = aDay;
        }
        else
            this.day = 0;
    }

    public void setMonth(int aMonth) {
        if (aMonth > 0 && aMonth < 13){
            this.month = aMonth;
        }
        else
            this.month = 0;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate(){
        System.out.printf("The date is: %d/%d/%d\n ", getDay(),getMonth(),getYear());



    }



}
