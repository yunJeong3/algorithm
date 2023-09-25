package section2;

import java.util.Scanner;

public class InterimLeader_11 {
    public int solution(int stuLen, int[][] arr) {
        // max는 Integer의 최솟값으로 정의
        int result = 0, max = Integer.MIN_VALUE;

        // target 값인 y값 i지정
        for(int i=1; i<=stuLen; i++) {
            int cnt = 0;
            // check할 값인 y값 j지정
            for(int j=1; j<=stuLen; j++) {
                // check할 값인 x값 k지정
                for(int k=1; k<=5; k++) {
                    // target으로 지정한 값과 일치하는 값이 있으면 cnt+1
                    // 똑같은 학생은 한 번만 cnt 하기 때문에 break
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            // max 보다 cnt 값이 더 크면 max, result 덮어씌우기
            if(max < cnt) {
                max = cnt;
                result = i;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        // 1학년부터 5학년까지 지내오면서 한 번이라도 같은 반이었던 사람이 가장 많은
        // 학생을 임시반장으로 지정.
        InterimLeader_11 T = new InterimLeader_11();
        Scanner scan = new Scanner(System.in);

        int stuLen = scan.nextInt();
        // y: 1번학생~N번학생, x: 1학년~5학년
        int[][] arr = new int[stuLen+1][6];
        for(int i=1; i<=stuLen; i++) {
            for(int j=1; j<=5; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(stuLen, arr));


    }
}