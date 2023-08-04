package exam;

public class exam03 {
    public static void main(String[] args) {
        exam01.student s1 =new exam01.student(120,"haha","k");

        s1.showInfo();

        exam01.student s2 =new exam01.student(140,"kim","E");
        s2.showInfo();

        double result =add(10.1,2.41,30.2);
        int c =add(10,20);

        System.out.println("s1 "+System.identityHashCode(s1));
        System.out.println("s2 "+System.identityHashCode(s2));


        exam01.student s3=s2;
        System.out.println("s3 "+System.identityHashCode(s3));

        s3.name="학생";
        s3.showInfo();
        s2.showInfo();
        //생성자가이미 정의된경우 컴파일러가 추가 x



        //함수으, ㅣ시그니처 함수를 구분하는 이름
        //패키지명 + 클래스명 +함수명 +매개변수 + 예의전가
        //함수의 시그니처가 같으면 같은 함수
        //함수의 시그니처가 다르면 다른 함수
        //매소ㅓ드 오버로드 아시죠? add 12 add 12 12

    }
    static int add(int num1,int num2){
        return num1+num2;
    }
    static double add(double num1,double num2,double num3){
        return num1+num2+num3;
    }

}
