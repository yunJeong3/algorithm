package section2;

import java.util.Scanner;

public class MaximumSum_9 {
    public int solution(int[][] arr, int arrLen) {
        int result = 0;

        // |, -
        for(int i=0; i<arrLen; i++) {
            int row = 0;
            int col = 0;
            for(int j=0; j<arrLen; j++) {
                row += arr[i][j];
                col += arr[j][i];
            }
            // row, column 합 중 최대값을 max에 담고 max가 result보다 크면 result에 담기.
            int max = Math.max(row, col);
            result = result < max ? max : result;
        }

        // \ (right) : 00, 11, 22 ...
        // / (left) : 04, 13, 22, ...
        int right = 0;
        int left = 0;
        for(int i=0; i<arrLen; i++) {
            right += arr[i][i];
            left += arr[i][arrLen-1-i];
        }
        // right, left 합 중 최대값을 max에 담고 max가 result보다 크면 result에 담기.
        int max = Math.max(right, left);
        result = result < max ? max : result;

        return result;
    }
    public static void main(String[] args) {
        // arrLen을 입력받으면 arrLen * arrLen의 격자판이 주어지고,
        // 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합을 출력한다.
        MaximumSum_9 T = new MaximumSum_9();
        Scanner scan = new Scanner(System.in);

        int arrLen = scan.nextInt();
        int[][] arr = new int[arrLen][arrLen];

        for(int i=0; i<arrLen; i++) {
            for(int j=0; j<arrLen; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(arr, arrLen));
    }
}
