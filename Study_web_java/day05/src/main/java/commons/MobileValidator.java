package commons;

public interface MobileValidator {
    default boolean checkmobile(String num){

        /**
            010 0000 0000
            011 000 0000
            016 000 0000
         */
        String mobile =num.replaceAll("\\D","");
        String pattern ="^01[016]\\d{3,4}\\d{4}$";

        return mobile.matches(pattern);
    }
}
