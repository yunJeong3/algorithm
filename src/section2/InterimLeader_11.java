package section2;

import java.util.Scanner;

public class InterimLeader_11 {
    public int[] solution(int stuLen, int[][] arr) {
//        int result = 0;
        int selY = 0;
        int selX = 0;
        int[] resultArr = new int[stuLen];

        for(int n=0; n<stuLen; n++) {
            for(int x=0; x<5; x++) {
                int target = arr[selY][selX];

                for(int y=0; y<stuLen; y++) {
                    if(selY == y && selX == x) {
                        continue;
                    }
                    if(arr[y][x] == target) {
                        resultArr[n]++;
                    }
                }
                if(selX >= 4) selX = 0;
                else selX++;
            }
            selY++;
        }
        return resultArr;
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

        int[] resultArr = T.solution(stuLen, arr);
        int top = resultArr[0];
        int idx = 0;
        for(int i=1; i<resultArr.length; i++) {
            if(top < resultArr[i]) {
                top = resultArr[i];
                idx = i;
            }
        }
        System.out.println(idx+1);

    }
}
