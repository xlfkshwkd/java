package exam02;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        Class cls =Ex02.class;
        myno anno=(myno)cls.getAnnotation(myno.class);
        String[] value =anno.value();
        System.out.println(Arrays.toString(value));
        //[이름]s
        //이름1,이름2,이름3

        int max = anno.max();
        int min =anno.min();
        System.out.printf("max=%d, min=%d%n",max,min);



    }
}
