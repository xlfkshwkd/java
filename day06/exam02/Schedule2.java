package exam02;

public class Schedule2 {
    private int year;
    private int mouth;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void printThis(){
        System.out.println(this);
        System.out.println(System.identityHashCode(this));
    }


/*
    @Override
    public String toString() {
        return "Schedule2{" +
                "year=" + year +
                ", mouth=" + mouth +
                ", day=" + day +
                '}';
    }
*/


    //참조 변수 출력  -> 참조변수 .toString  호출
    //System.out.println(s1) 불러오는거 스트링으로 출력이요
    //



}
