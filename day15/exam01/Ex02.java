package exam01;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@MyAnno(num1=100,num2 = 200)//({"값1","값2","값3"}) //배열넣으면 중괄호 추가 하지만 하나면 없어도 됨

public class Ex02 {
    public static void main(String[] args) {
        Class cls =Ex02.class;
        MyAnno anno =(MyAnno)cls.getAnnotation(MyAnno.class);
        String[] value =anno.value();
        System.out.println(Arrays.toString(value));

        int num1= anno.num1();
        int num2= anno.num2();
        System.out.println("num1 :"+ num1+" num2 :"+num2);

        //애노테이션 정보 전달이 목적
        //속성들 설정
        //구현채 class class
        //상위인터페이스 지식을 만들수 있는 지식

        // 입 출력
        //자바 .io 패키지 입출력
        //입력 출력 스트림
        //문자기반 스트림 ,바이트 기반 스트림
        //입출력 list interface 1바이트 단위 스트림
        //input 최상 스트림
        // 출력스트림 :outputStream 추상 클래스
        //read
        // 기반스트림 : 데티어에 직접 접근하는 스트림
        // 보조 스트림 : 데이터에 직접 접슨 x , 다른스트림에게 추가 기능


        // FileInputStream 파일에서 직접 읽어 오는 스트림
        //ByteArrayStream 메모리에서 직접 읽어오는 스트림
      //  AutoCloseable







    }
}
