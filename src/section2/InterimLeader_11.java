package section2;

import java.util.Scanner;

public class InterimLeader_11 {
    public int solution(int stuLen, int[][] arr) {
        int result = 0;


        return result;
    }
    public static void main(String[] args) {
        InterimLeader_11 T = new InterimLeader_11();
        Scanner scan = new Scanner(System.in);

        int stuLen = scan.nextInt();
        int[][] arr = new int[stuLen][5];

        for(int i=0; i<stuLen; i++) {
            for(int j=0; j<5; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(stuLen, arr));

    }
}
