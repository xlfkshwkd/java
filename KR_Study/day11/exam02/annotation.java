package exam02;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;

public class annotation {
    // 주석 주해 설명
    @interface hahah{
        //정보 전달 주석 느낌
    }
    //JDK 에 정의 되어있는 기본 애너테이션
    /*
    @Override
    @Deprecated
    @SafeVarargs
    @Documented*/

    //>???????????? 메타 인지

    // @RetentionPolicy
    //자바 코드에는 존재 컴파일 이후 제거
    // 컴파일시 정보가 전달
    // 컴파일 시에 정보가 전달
    // 기본값 정보전달 X

   // .RUNTIME
    // 자바코드에도 존재 클래스 파일에도 존재

  //  ElementType;
}

