package section3;

import java.util.Scanner;

public class SumConsecutiveNum_5 {
    public int solution(int target){
        /*
            cnt: 연속되는 자연수의 개수 (ex. 1+2: 2, 1+2+3: 3)
            target: 연속되는 자연수를 합해서 나와야 하는 값
            result: 연속되는 자연수가 합해져서 target이 나온 총 경우의 수
        */

        int cnt = 1, result = 0;
        // cnt를 1로 지정해두고 시작하기 때문에 target 1 감소
        target--;

        // target 값이 0이하가 될 때까지 while 반복
        while(target>0) {
            // cnt는 1부터 시작했기 때문에 2부터 target에서 차감.
            cnt++;
            target -= cnt;
            // 차감한 target 값에서 cnt를 나눈 나머지가 0일 때만 result 증가
            if(target % cnt == 0) {
                result++;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        SumConsecutiveNum_5 T = new SumConsecutiveNum_5();
        Scanner scan = new Scanner(System.in);

        // 연속된 자연수의 합으로 target을 표현하는 방법의 가짓수 구하기
        int target = scan.nextInt();
        System.out.println(T.solution(target));

    }
}
