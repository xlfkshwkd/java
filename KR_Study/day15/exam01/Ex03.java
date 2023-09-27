package exam01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

public class Ex03 {
    public static void main(String[] args) {
        int[] scores ={10,20,30,40,50,60,100};
        IntSummaryStatistics stat= Arrays.stream(scores).summaryStatistics();
        System.out.printf("총 개수: %d ,합계 :%d 평균 : %.2f 최대 : %d ,최소 : %d%n",
                stat.getCount(),stat.getSum(),stat.getAverage(),stat.getMax(),stat.getMin());

    int[] sores2=
            Arrays.stream(scores).boxed().sorted(Comparator.reverseOrder()).mapToInt(x-> x).toArray();


    System.out.println(Arrays.toString(sores2));

    }
}
