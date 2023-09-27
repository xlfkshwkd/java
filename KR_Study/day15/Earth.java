public class Earth {
    public static void main(String[] args) {

        int result= exists(new String[]{"p","o","s"},new String[] {"pos","dsdsa"});
    System.out.println();
    }
    public static int exists(String[] spell,String[] dic){
        for(String d :dic){
            d=d.toLowerCase();
            boolean match =true;
            for(String s : spell){
                if(d.indexOf(s.toLowerCase())==-1){
                    match =false;
                }
            }
            if(match) return 1;
        }


        return 2;
    }
}
