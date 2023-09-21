package exam01;
import java.util.Scanner;
import static java.lang.Math.random;

public class dice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("주사위 눈을 입력하세요 (1에서 6까지의 정수 3개):");

        // 주사위 눈 입력
        int[] dice = new int[3];
        for (int i = 0; i < 3; i++) {
            dice[i] = scanner.nextInt();
        }

        int prize = calculatePrize(dice); // 상금 계산

        System.out.println("상금: " + prize + "원");

    }
    public static int calculatePrize(int[] dice) {
        int[] counts = new int[7]; // 각 눈의 개수를 저장할 배열

        // 각 눈의 개수 세기
        for (int d : dice) {
            counts[d]++;
        }

        int maxCount = 0;
        int maxCountNumber = 0;

        // 같은 눈 중 가장 많이 나온 것 찾기
        for (int i = 1; i <= 6; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                maxCountNumber = i;
            }
        }

        int prize = 0;

        if (maxCount == 3) { // 같은 눈이 3개가 나온 경우
            prize = 10000 + maxCountNumber * 1000;
        } else if (maxCount == 2) { // 같은 눈이 2개가 나온 경우
            prize = 1000 + maxCountNumber * 100;
        } else { // 모두 다른 눈일 경우
            for (int d : dice) {
                if (d > prize) {
                    prize = d;
                }
            }
            prize *= 100;
        }

        return prize;
    }

}
