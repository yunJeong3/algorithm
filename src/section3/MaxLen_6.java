package section3;

import java.util.Scanner;

public class MaxLen_6 {
    public int solution(int arrLen, int changeCnt, int[] arr) {
        int result=0, cnt=0, lt=0;

        for(int rt=0; rt<arrLen; rt++) {
            if(arr[rt] == 0) cnt++;
            while(cnt > changeCnt) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            result = Math.max(result, rt-lt+1);
        }


        return result;
    }
    public static void main(String[] args) {
        MaxLen_6 T = new MaxLen_6();
        Scanner scan = new Scanner(System.in);
        int arrLen = scan.nextInt();
        int changeCnt = scan.nextInt();
        int[] arr = new int[arrLen];

        for(int i=0; i<arrLen; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(arrLen, changeCnt, arr));

    }
}
