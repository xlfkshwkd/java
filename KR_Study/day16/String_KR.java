import java.util.HashMap;

public class String_KR {
    public static void main(String[] args) {
        int result = Banana("banana");
        System.out.println(result);
        int result2 = Banana("abracadabra");
        System.out.println(result2);
        int result3 = Banana("aaabbaccccabba");
        System.out.println(result3);

    }

    public static int Banana(String s) {
        int answer = 0; // 최종 단어 개수를 저장할 변수
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(); // 문자와 등장 횟수를 저장하는 맵
        int cnt = 0; // 현재 문자와 다른 문자의 등장 횟수를 카운트

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i); // 현재 문자를 가져옵니다.

            if (map.isEmpty()) { // 맵이 비어있으면 첫 문자 등장
                map.put(x, 1);  //맵에 x 값과 1 값 삽입. x 는 현재 문자 값
            } else {
                if (map.containsKey(x)) { // 맵에 현재 문자가 이미 등장한 경우
                    int value = map.get(x); //x 에이있는 KEY  값 불러옴
                    map.put(x, value + 1); // 현재 문자 등장 횟수를 증가시킵니다.
                } else { // 현재 문자와 다른 문자가 등장한 경우
                    cnt++; // 현재 문자와 다른 문자의 등장 횟수 증가
                    for (char key : map.keySet()) {
                        if (map.get(key) == cnt) {
                            map.remove(key); // 등장 횟수가 같은 문자를 맵에서 제거
                            answer++; // 분리된 단어로 인정하고 결과값 증가
                            cnt = 0; // 등장 횟수 초기화
                        }
                    }
                }
            }
        }

        if (!map.isEmpty()) { //널인지 체크
            answer++; // 맵에 남아 있는 문자열은 마지막 단어로 인정
        }

        return answer; // 최종 단어 개수 반환
    }
}