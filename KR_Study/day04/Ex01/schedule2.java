package Ex01;

public class schedule2 {
    private int year ;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
        //this는 구별할때 씀
        //명백하지않을때
    }

    @Override
    public String toString() {
        return "schedule2{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
