package section2;

import java.util.Scanner;

public class GetRank_8 {
    public int[] solution(int arrLen, int[] arr) {
        int[] result = new int[arrLen];

        for(int i=0; i<arrLen; i++) {
            int rank = 1;
            for(int j=0; j<arrLen; j++) {
                // i번째 점수보다 높은 점수(j)가 있으면 i번째의 순위를 낮춤(+1)
                if(arr[i] < arr[j]) rank++;
            }
            // i번째의 등수를 result에 담기
            result[i] = rank;
        }

        return result;
    }
    public static void main(String[] args) {
        // N명의 학생의 점수가 입력되면 등수를 입력된 순서대로 출력
        // 같은 점수가 입력될 경우 높은 등수로 동일 처리한다. (ex) 100점이 3명이면 그 이후 점수는 4등부터 처리.
        GetRank_8 T = new GetRank_8();
        Scanner scan = new Scanner(System.in);

        int arrLen = scan.nextInt();
        int[] arr = new int[arrLen];
        for(int i=0; i<arrLen; i++) {
            arr[i] = scan.nextInt();
        }

        for(int i: T.solution(arrLen, arr)) {
            System.out.print(i + " ");
        }
    }
}
