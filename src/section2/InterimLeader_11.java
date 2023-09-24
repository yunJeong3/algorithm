package section2;

import java.util.Scanner;

public class InterimLeader_11 {
    public int solution(int stuLen, int[][] arr) {
        int result = 0, max = Integer.MIN_VALUE;

        for(int i=1; i<=stuLen; i++) {
            int cnt = 0;
            for(int j=1; j<=stuLen; j++) {
                for(int k=1; k<=5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(max < cnt) {
                max = cnt;
                result = i;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        //
        InterimLeader_11 T = new InterimLeader_11();
        Scanner scan = new Scanner(System.in);

        int stuLen = scan.nextInt();
        int[][] arr = new int[stuLen+1][6];
        for(int i=1; i<=stuLen; i++) {
            for(int j=1; j<=5; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(stuLen, arr));


    }
}