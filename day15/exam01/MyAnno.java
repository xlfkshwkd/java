package exam01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD,ElementType.METHOD}) //value 생략 가능
@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnno {
  String[] value() default {"값1","값2"};
  int num1();
  int num2();

}
