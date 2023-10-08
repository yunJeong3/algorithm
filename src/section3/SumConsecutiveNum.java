package section3;

import java.util.Scanner;

public class SumConsecutiveNum {
    public int solution(int target){
        int cnt = 1;
        int result = 0;
        target--;
        while(target>0) {
            cnt++;
            target = target - cnt;
            if(target % cnt == 0) {
                result++;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        SumConsecutiveNum T = new SumConsecutiveNum();
        Scanner scan = new Scanner(System.in);

        // 연속된 자연수의 합으로 target을 표현하는 방법의 가짓수 구하기
        int target = scan.nextInt();
        System.out.println(T.solution(target));

    }
}
