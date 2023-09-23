package section2;

import java.util.Scanner;

public class InterimLeader_11 {
    public int solution(int stuLen, int[][] arr) {
        int result = 0;
        int selY = 0;
        int selX = 0;
        int[] resultArr = new int[stuLen];

        int stu = arr[selY][selX];
        while(selY < stuLen) {
            for(int x=0; x<5; x++) {
                for(int y=0; y<stuLen; y++) {
                    if(selY == y && selX == x) {
                        System.out.print("N ");
                        continue;
                    }
                    if(stu == arr[y][x]) {
                        result++;
                    }
                    System.out.print(arr[y][x] + " ");
                }
                System.out.println();
            }
            selY++;
            System.out.println();
        }

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
