package exam01;

import java.util.Map;
import java.util.HashMap;

 public class LottoRanking {

        public static void main(String[] args) {

            int[] lottos = {44, 1, 0, 0, 31, 25};

            int[] win_nums = {31, 10, 45, 1, 6, 19};



            int[] result = lottomachine (lottos, win_nums); //배열넣기


            System.out.println("최고 순위: " + result[0]+ "등");

            System.out.println("최저 순위: " + result[1] + "등");



        }

        public static int[] lottomachine (int[] lottos, int[] win_nums) {

            Map<Integer, Integer> winNumsMap = new HashMap<>();

            int zeroCount = 0;

            for (int num : win_nums) {

                winNumsMap.put(num, 1);  //당첨번호 넣

            }
            int matchCount = 0;

            for (int num : lottos) {
                if (num == 0) {
                    zeroCount++; //찢어진 부분 찾기
                } else if (winNumsMap.containsKey(num)) { //Map에 번호있으면 카운트 올림
                    matchCount++;
                }
            }


            int[] answer = new int[2];

            answer[0] = 7 - (matchCount + zeroCount); // 최고 순위 다맞을경우

            answer[1] = 7 - matchCount; // 최저 순위 찢은건 틀림



            return answer;

        }


// 자격 요건 + 우대 사항
























}
