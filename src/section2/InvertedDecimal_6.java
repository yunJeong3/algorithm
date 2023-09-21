package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class InvertedDecimal_6 {
    public boolean isDecimal (int num) {
        if(num == 1) return false;
        for(int i=2; i<num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    public ArrayList<Integer> solution(int arrLen, int[] arr) {
        ArrayList<Integer> resultArr = new ArrayList<>();

        for(int i=0; i<arrLen; i++) {
            int tmp = arr[i];
            int res = 0;

            while(tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if(isDecimal(res)) resultArr.add(res);
        }
        return resultArr;
    }
    public static void main(String[] args) {
        // N개의 자연수를 입력하고, 각 자연수를 뒤집어 그 수가 소수인지 판별
/*
9
32 55 62 20 250 370 200 30 100
*/
        InvertedDecimal_6 T = new InvertedDecimal_6();
        Scanner scan = new Scanner(System.in);

        int arrLen = scan.nextInt();
        int[] arr = new int[arrLen];

        for(int i=0; i<arrLen; i++) {
            arr[i] = scan.nextInt();
        }

        for(int n : T.solution(arrLen, arr)) {
            System.out.print(n + " ");
        }
    }
}
