package Ex01;

public class schedule {
    private int year ;
    private int month;
    private int day;

    public schedule(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;


    }

    /*
    public  Schedule2(){
        this(2023,9,8);
    }
    public  Schedule2(int year,int month,int day)
    {
        this.day=day;
        this.month=month;
        this.year =year;

    }
    */
    @Override
    public String toString() {
        return "schedule{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
    public void printthis(){
        System.out.println();
    }

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
        if (month ==2&& day>28)
        {
            day = 28;
        }
        this.day = day;
    }


}

