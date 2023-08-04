package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public void setYear(int _year) {
        year=_year;
    }
    public void setMonth(int _month) {
        month =_month ;
    }
    public void setDay(int _day) {
        if(month==2 && _day<=28) {
            day = 28;
        }
    }










    void showInfo(){
        System.out.println("year: "+year +"month: "+month+"day: " +day);
    }



    //매서드를 통하여 값을 설정하도록 권장 ㅇㅇ

}
