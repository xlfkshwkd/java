package exam02;

import java.util.ArrayList;
import java.util.IllformedLocaleException;
import java.util.List;
import java.util.Optional;

public class Ex03 {
    public static void main(String[] args) {
     String str =null;
     Optional<String> opt =Optional.ofNullable(str);
    // String str2 =opt.orElseThrow(()->new IllegalStateException());
  //   String str2 =opt.orElseThrow(IllformedLocaleException::new);
        //널값 감싸 레퍼 클래스
        //기능처리를 위해 감쌈 null
        //count(),sum(),average(),max(),min()


    }
}
