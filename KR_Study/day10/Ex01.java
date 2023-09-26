public class Ex01 {
    public static void main(String[] args) {
        String str1=new String("가나다");
        String str2=new String("가나다");

        System.out.println(str1==str2);
        System.out.printf("str1.equals(str2) %s%n",str1.equals(str2));

        String str ="ABC";
        System.out.printf("str %s%n",System.identityHashCode(str));

        str += "DEF";
        System.out.printf("str %s%n",System.identityHashCode(str));

        System.out.println(str);

        //스트링 버퍼는 주소 그대로 따라감
        StringBuffer sb=new StringBuffer();

        sb.append("ABC");
        System.out.printf("sb %s%n",System.identityHashCode(sb));

        sb.append("ABC");
        System.out.printf("sb %s%n",System.identityHashCode(sb));

        sb.append("ABC");

        System.out.printf("sb %s%n",System.identityHashCode(sb));

        String str5 =sb.toString();
        System.out.println(str5);
        //주소가 달라짐
        System.out.printf("sb %s%n",System.identityHashCode(str5));

        StringBuffer  sb2 =new StringBuffer();
        System.out.printf("sb2 %s%n",System.identityHashCode(sb2));
        StringBuffer sb3 = sb2.append("abc");
        System.out.printf("sb2.equals(sb3) %s%n",sb2.equals(sb3));

        String str6 =sb2.toString();
        System.out.print(str6+ "\n");

        String[] moblies={"010-3087-9808","010-1000-9999"};
        String[] names ={"이름","이름 2"};

        for (int i=0;i<names.length;i++)
        {
            //%s 문자열
            //%c 문자
            //%d 정수
            //%f 실수
            //%n 줄개행 문자
            String str10 =String.format("%s(%s)",names[i],moblies[i]);
            System.out.println(str10);
        }



    }
}
