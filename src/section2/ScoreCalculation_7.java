package section2;

import java.util.Scanner;

public class ScoreCalculation_7 {
    public int solution(int[] arr, int arrLen) {
        int total = 0;
        int score = 0;

        for(int i=0; i<arrLen; i++) {
            if(arr[i] == 1) {
                score++;
                total += score;
            } else score = 0;
        }

        return total;
    }
    public static void main(String[] args) {
        ScoreCalculation_7 T = new ScoreCalculation_7();
        Scanner scan = new Scanner(System.in);

        int arrLen = scan.nextInt();
        int[] arr = new int[arrLen];

        for(int i=0; i<arrLen; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(arr, arrLen));
    }
}
