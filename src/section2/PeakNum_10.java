package section2;

import java.util.Scanner;

public class PeakNum_10 {
    public int solution(int[][] arr, int arrLen) {
        // 체크할 인덱스 조건 담을 배열
        int[] dy = {-1, 0, +1, 0};
        int[] dx = {0, +1, 0, -1};
        int cnt = 0;

        for(int i=1; i<=arrLen; i++) {
            for(int j=1; j<=arrLen; j++) {
                int tmp = arr[i][j];
                boolean isTrue = true;
                for(int k=0; k<4; k++) {
                    int ny = i + dy[k];
                    int nx = j + dx[k];
                    if(tmp <= arr[ny][nx]) {
                        isTrue = false;
                        break;
                    }
                }
                if(isTrue) {
                    cnt++;
//                    System.out.println(i + " " + j + " " + arr[i][j]);
                }
            }
        }

        return cnt;
    }
    public static void main(String[] args) {

        /*
5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2
        */
        PeakNum_10 T = new PeakNum_10();
        Scanner scan = new Scanner(System.in);

        int arrLen = scan.nextInt();
        int[][] arr = new int[arrLen+2][arrLen+2];
        for(int i=1; i<=arrLen; i++) {
            for(int j=1; j<=arrLen; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(arr, arrLen));
    }
}
