import java.util.Arrays;
import java.util.HashMap;

public class String_KR {
    public static void main(String[] args) {

        int result= String_ba_na(new String[]{"banana","abracadabra","aaabbaccccabba"});
        System.out.println(result);

    }
    public static int String_ba_na(String[] String_BK){
        for(String s:String_BK){
            int answer = 0;
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            int cnt = 0;
            for(int i=0; i<s.length(); i++){
                char x = s.charAt(i);
                if(map.isEmpty()){
                    map.put(x, 1);
                }else{
                    if(map.containsKey(x)){
                        int value = map.get(x);
                        map.put(x, value+1);
                    }else{
                        cnt++;
                        for(char key : map.keySet()){
                            if(map.get(key)== cnt){
                                map.remove(key);
                                answer++;
                                cnt=0;
                            }
                        }
                    }
                }
            }
            if(!map.isEmpty()){
                answer++;
            }
            return answer;

        }
    }
}
