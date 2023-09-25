public class student {
    int id;
    String name;
    String subject;
    public student(int _id,String _name, String _subject){
        //객체 생성 이후 해야할 작업들
        /*
        id =12;
        name ="sim";
        subject ="과학";
    */

        id=_id;
        name =_name;
        subject=_subject;

    }




    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }


    // this  생성자 메서드를 다른 생성자에서 호출
    //생성자 메서드의 첫번째 라인 정리
    //



}
