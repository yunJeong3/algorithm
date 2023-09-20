package section2;

import java.util.Scanner;

public class DecimalCount_5 {
    public int solution(int max) {
        int cnt = 0;
        int[] arr = new int[max+1];

        for(int i=2; i<=max; i++) {
            if(arr[i] == 0) {
                cnt++;
                for(int j=i; j<=max; j+=i) {
                    arr[j] = 1;
                }
            }
        }


        return cnt;
    }
    public static void main(String[] args) {
        // 에라토스테네스체를 통해 입력받은 수까지의 소수 갯수 세기.
        DecimalCount_5 T = new DecimalCount_5();
        Scanner scan = new Scanner(System.in);

        int max = scan.nextInt();
        System.out.println(T.solution(max));
    }
}
